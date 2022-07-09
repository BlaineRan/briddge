package com.ran.controller;

import com.ran.controller.user.LoginResult;
import com.ran.domain.PassagewayElement;
import com.ran.domain.User;
import com.ran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true")
public class UserAPI {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserList")
    @ResponseBody
    List<User> getUserList(){
        return userService.queryAllUsers();
    }

    /**
     * POST 通过账号密码进行登录操作
     * input : 账号密码
     * output:
     * 返回登录状态并设置session信息
     * */
    @RequestMapping("/login")
    @ResponseBody
    Map<String,Object> login(@RequestBody(required = false) Map<String,String> data){
        User user = userService.matchUser(data.get("account"),data.get("password"));
        List<User> userList = userService.queryAllUsers();
        Map<String,Object> result = new HashMap<>();

        //每次登录时重置登录状态
        for(User u : userList){
            if(u.getActive() == 1){
                u.setActive(0);
                userService.setActive(u.getUserId(),0);
            }
        }

        if(user == null){
            result.put("status","error");
            result.put("type","account");
            result.put("currentAuthority","");
            return result;
        }else{
            result.put("status","ok");
            result.put("type","account");
            result.put("currentAuthority",user.getUserType());

            userService.setActive(user.getUserId(),1);
            return result;
        }

    }

    /**
     * POST 注册用户
     * input : 用户名 账户 密码 用户类型
     * output: 是否成功
     * */
    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody(required = false) Map<String,String> data){
        String userName = data.get("userName");
        String account = data.get("account");
        String password = data.get("password");
        String userType = data.get("userType");
        User user = new User(-1,account,password,userType,"",userName,0);

        String status = userService.register(user);

        return status;
    }


    /**
     * POST 退出登录
     * input : null
     * output: 是否成功
     * */
    @RequestMapping("/outLogin")
    @ResponseBody
    String outLogin(){
        List<User> userList =  userService.queryAllUsers();
        for(User u : userList){
            if(u.getActive() == 1){
                userService.setActive(u.getUserId(),0);
                return "success";
            }
        }
        return "fail";
    }

    /**
     * POST 通过账号密码进行用户查询
     * */
    @RequestMapping("/getUser")
    @ResponseBody
    Map<String,Object> queryUser(@RequestBody(required = false) Map<String,String> data){
        User user = userService.matchUser(data.get("account"),data.get("password"));
        Map<String,Object> result = new HashMap<>();
        result.put("name",user.getUserName());
        result.put("userid", String.valueOf(user.getUserId()));
        result.put("unreadCount",0);
        result.put("access",user.getUserType());

        return result;
    }

    /**
     * GET 查询当前在线的用户
     * */
    @RequestMapping("/currentUser")
    @ResponseBody
    Map<String,Object> currentUser(){
        Map<String,Object> data = new HashMap<>();
        List<User> userList = userService.queryAllUsers();
        User currentUser = null;

        for(User user : userList){
            if(user.getActive() == 1){
                currentUser = user;
            }
        }
        if(currentUser == null){
            return null;
        }
        System.out.println(currentUser);
        data.put("name",currentUser.getUserName());
        data.put("userid", String.valueOf(currentUser.getUserId()));
        data.put("unreadCount",0);
        data.put("access",currentUser.getUserType());

        return data;
    }

    /**
     * 根据username查id
     * */
    @RequestMapping("/nameToId")
    @ResponseBody
    int transferNameToId(@RequestBody(required = false)Map<String,String> data){
        return userService.transferNameToId(data.get("userName"));
    }
}
