package com.example.messageBoard.entity;

import java.io.Serializable;
public class User implements Serializable {

    private String name;//姓名
    private String gender;//性别
    private String passWord;//密码
    private String phone;//手机号
    private String email;//邮箱
    private String number;//身份证号
    private String accountNumber;//账号
    private StringBuffer str ;
    private UserName data;

    public User(){}
    public UserName getData() {
        return data;
    }

    public void setData(UserName data) {
        this.data = data;
    }

    public User(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", str=" + str +
                ", data=" + data +
                '}';
    }

    public StringBuffer getStr() {
        return str;
    }

    public void setStr(StringBuffer str) {
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
