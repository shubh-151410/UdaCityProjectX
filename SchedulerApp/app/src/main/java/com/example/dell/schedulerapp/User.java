package com.example.dell.schedulerapp;

/**
 * Created by DELL on 07-04-2018.
 */

public class User {
    String name ="";
    String username ="";
    String email ="";
    String phoneno ="";
    String password ="";
    String confirmpass="";
    String token="";
    public User() {    }

    public User(String name, String username, String email, String phoneno, String password, String confirmpass, String token) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneno = phoneno;
        this.password = password;
        this.confirmpass = confirmpass;
        this.token=token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
