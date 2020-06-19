package com.AOP切面JDK方式代理;

import org.springframework.stereotype.Component;

@Component(value = "女人类")
public class 女人类 implements  ISAY{
    @Override
    public void 说话() {
        System.out.println("我是女人");
    }

    @Override
    public void 吃饭() {
        System.out.println("女人吃饭");
    }
}
