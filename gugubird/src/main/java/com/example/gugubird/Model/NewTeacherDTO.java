package com.example.gugubird.Model;

import java.sql.Date;

public class NewTeacherDTO {
    private String account;
    private String password;
    private String name;
    private String email;
    private Integer status;

    public NewTeacherDTO getNewTeacherDTO()
    {
        return this;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}