package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessTool implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("***我的后置处理器被调用了***"+beanName);
        return bean;
    }


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("***我的前置处理器被调用了***"+beanName);
        return bean;
    }
}
