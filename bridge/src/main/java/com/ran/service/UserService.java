package com.ran.service;

import com.ran.dao.UserMapper;
import com.ran.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    /**
     * 查询所有用户
     * */
    public List<User> queryAllUsers(){
        List<User> list = userMapper.selectAll();
        return list;
    }
    /**
     * 查询单个用户
     * */
    public User queryUserById(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 查询在线用户
     * */
    public User queryUserActive(){
        List<User> userList = userMapper.selectAll();
        for(User u : userList){
            if(u.getActive() == 1){
                return u;
            }
        }
        return null;
    }

    /**
     * 根据账号密码匹配用户
     * */
    public User matchUser(String account, String password){
        List<User> userList = userMapper.selectAll();
        for(User user : userList){
            if(user.getAccount().equals(account) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    /**
     * 设置用户在线
     * */
    public int setActive(Integer userId,Integer active){
        User newUser = new User();
        newUser.setActive(active);
        newUser.setUserId(userId);
        return userMapper.updateByPrimaryKeySelective(newUser);
    }


    /**
     * 注册用户:
     *  1.查重
     *  2.修正id的插入用户
     * */
    public String register(User user){
        List<User> userList = userMapper.selectAll();
        for(User u : userList){
            if(u.getUserName().equals(user.getUserName()) || u.getAccount().equals(user.getAccount())){
                return "duplicateUser";
            }
        }
        int newUserId = userList.get(userList.size()-1).getUserId()+1;
        user.setUserId(newUserId);
        userMapper.insert(user);

        return "success";
    }

    /**
     * 根据username查userId
     * */
    public int transferNameToId(String userName){
        return userMapper.selectUserIdByName(userName);
    }

}
