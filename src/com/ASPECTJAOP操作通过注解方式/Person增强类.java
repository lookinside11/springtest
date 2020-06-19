package com.ASPECTJAOP操作通过注解方式;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Person增强类  {

    @Pointcut(value = "execution(* com.ASPECTJAOP操作通过注解方式.Person.say(..))")
    public void 切入点定义()
    {

    }

    @Before(value = "切入点定义()")
    @Order(1)
    public void 前置方法1()
    {
        System.out.println("---我是前置方法-1#--");
    }

    @Before(value = "切入点定义()")
    @Order(1)
    public void 前置方法2()
    {
        System.out.println("---我是前置方法-2#--");
    }


    @After(value = "切入点定义()")
    public void 后期方法(){
//        这个也是不管有没有异常，都是执行的。
        System.out.println("---我是后置方法");
    }
    @Around(value = "切入点定义()")
    public  void 环绕通知(ProceedingJoinPoint pro) throws Throwable {
        System.out.println("---我是环绕方法--前环绕");
            //通过参数拿到了切入点，这里执行切入方法，并在之前和之后都执行逻辑。这个优先级要高于@Before和@After
            pro.proceed();
        System.out.println("---我是环绕方法--后环绕");
    }

    @AfterThrowing(value = "切入点定义()")
    public  void 异常通知()
    {
        System.out.println("---我是异常通知方法");
    }
    @AfterReturning(value = "切入点定义()")
    public void 最终通知()
    {
//        不管有没有异常，这个注解都是要执行的。
        System.out.println("---我是最终通知方法");
    }
}
