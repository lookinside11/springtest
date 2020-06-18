package com.注解方式创建bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "头发")
public class Hair implements  Say{

    @Value("黑色")
    private String hairColor;

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public void 说话() {
        System.out.println("头发是"+getHairColor());
    }
}
