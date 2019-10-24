package com.example.messageBoard.entity;

public class UserMap {

    private String number = "123456";//身份证号
    private String accountNumber = "456123";//账号

    @Override
    public String toString() {
        return "UserMap{" +
                "number='" + number + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
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
