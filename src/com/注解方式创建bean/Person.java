package com.注解方式创建bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "person")
public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Autowired
    //@Qualifier(value = "裤子")
    @Resource(name = "头发")
    private Say hair;


    public Say getHair() {
        return hair;
    }

    public void setHair(Say hair) {
        this.hair = hair;
    }
}
