package com.ran.domain;

public class User {
    /**
    * 用户编号
    */
    private Integer userId;

    /**
    * 用户账号
    */
    private String account;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 用户类型
    */
    private String userType;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户名
     */
    private String userName;

    private int active;


    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", userType=").append(userType);
        sb.append(", avatar=").append(avatar);
        sb.append(", active=").append(active);
        sb.append("]");
        return sb.toString();
    }

    public User(Integer userId, String account, String password, String userType, String avatar, String userName, int active) {
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.userType = userType;
        this.avatar = avatar;
        this.userName = userName;
        this.active = active;
    }

    public User() {
    }
}
