package com.neoteric.ecommerce;

public class Login {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public Login(String username, String password){
        this.username= username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
