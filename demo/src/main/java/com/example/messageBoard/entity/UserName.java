package com.example.messageBoard.entity;

import java.util.List;
import java.util.Map;

public class UserName {
    private String name;
    private int i;
    private List<UserList> list;
    private Map<Object, UserMap> map;

    public Map<Object, UserMap> getMap() {
        return map;
    }

    public void setMap(Map<Object, UserMap> map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    @Override
    public String toString() {
        return "UserName{" +
                "name='" + name + '\'' +
                ", i=" + i +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public UserName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
