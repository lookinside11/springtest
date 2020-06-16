package com.beans;

public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void sayHi()
    {
        System.out.println("你好--"+this.name);
    }
}
