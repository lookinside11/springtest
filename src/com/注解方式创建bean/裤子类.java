package com.注解方式创建bean;

import org.springframework.stereotype.Component;

@Component(value = "裤子")
public class 裤子类  implements Say{

    @Override
    public void 说话() {
        System.out.print("裤子说");
    }
}
