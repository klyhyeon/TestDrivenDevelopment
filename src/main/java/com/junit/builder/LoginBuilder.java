package com.junit.builder;

import com.junit.domain.Login;

public class LoginBuilder {

    private String email;
    private String password;

    public LoginBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public LoginBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public Login build() {
        return new Login(email, password);
    }
}
