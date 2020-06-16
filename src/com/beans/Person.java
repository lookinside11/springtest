package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor
{


    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("属性注入setname---"+name);
        this.name = name;
    }

    public  void sayHi()
    {
        System.out.println("你好--"+this.name);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName的接口方法---"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactoryName的接口方法---"+beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("上下文接口方法---"+applicationContext.toString());
        System.out.println("=====");

    }



}
