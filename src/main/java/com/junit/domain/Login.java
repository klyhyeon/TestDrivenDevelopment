package com.junit.test.domain;

public class Login {

    private String email;
    private String password;
    private String nickName;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Login() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
