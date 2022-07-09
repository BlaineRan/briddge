package com.ran.controller.user;

public class LoginResult {
    public String status;
    public String type;
    public String currentAuthority;

    public LoginResult(String status, String type, String currentAuthority) {
        this.status = status;
        this.type = type;
        this.currentAuthority = currentAuthority;
    }
}
