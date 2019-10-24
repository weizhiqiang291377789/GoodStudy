package com.example.messageBoard.entity;

public enum EnumTest {
    Monday,Tuesday,Wednesday,Thursday,Friday(1),Saturday,Sunday;



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    EnumTest(int value) {
        this.value = value;
    }
    EnumTest() {

    }
}
