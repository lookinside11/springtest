package com.AOP切面;

import org.springframework.stereotype.Component;

@Component(value = "女人类")
public class 女人类 implements  ISAY{
    @Override
    public void 说话() {
        System.out.println("我是女人");
    }
}
