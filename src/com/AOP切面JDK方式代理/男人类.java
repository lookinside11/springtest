package com.AOP切面JDK方式代理;

import org.springframework.stereotype.Component;

@Component(value = "男人类")
public class 男人类 implements  ISAY{
    @Override
    public void 说话() {
        System.out.println("我是男人");
    }

    @Override
    public void 吃饭() {
        System.out.println("男人吃饭");
    }
}
