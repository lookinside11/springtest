package com.ASPECTJAOP操作;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Person增强类  {

    @Before(value = "execution(* com.ASPECTJAOP\u64CD\u4F5C.Person.say(..))")
    public void 前置方法()
    {
        System.out.println("我是前置方法执行");
    }

}
