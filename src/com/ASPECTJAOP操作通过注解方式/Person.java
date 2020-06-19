package com.ASPECTJAOP操作通过注解方式;

import org.springframework.stereotype.Component;


@Component
public class Person {

    public void say()
    {

        System.out.println("你好我是person");
    }

}
