package com.ASPECTJAOP操作通过注解方式;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = {"com.ASPECTJAOP操作通过注解方式"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigClass {
}
