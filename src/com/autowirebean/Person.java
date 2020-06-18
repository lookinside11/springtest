package com.autowirebean;

public class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Hair hair;

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
}
