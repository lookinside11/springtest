package com.AOP切面;

import org.springframework.stereotype.Component;

@Component(value = "男人类")
public class 男人类 implements  ISAY{
    @Override
    public void 说话() {
        System.out.println("我是男人");
    }
}
