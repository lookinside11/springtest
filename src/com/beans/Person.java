package com.beans;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,  InitializingBean, DisposableBean
{
    public Person() {
        System.out.println("per是实体类被构造");
    }

    private  String name;
    public String getName() {
        return name;
    }

    @PostConstruct
    public void definit()
    {
        System.out.println("--我自己的初始化方法了--");
    }

    @PreDestroy
    public void defdestroy()
    {
        System.out.println("--我自定义的销毁方法！--");
    }
    public void setName(String name) {
        System.out.println("属性注入setname---"+name);
        this.name = name;
    }

    public  void sayHi()
    {
        System.out.println("--------------你好--"+this.name+"--------------------");
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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性被设置以后的");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("bean被他妈销毁了");
    }
}
