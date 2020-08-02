package com.ycbron.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class CustomAnnotation {
    //注解可以显示赋值，如果没有默认值，必须给注解赋值
    @MyAnnotation(name = "ycbron")
    public void test(){};

    @MyAnnotation1("ycbron")
    public void test1(){};
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    //注解的参数：参数类型 + 参数名（）；
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在。
    String[] school() default {"HNU"};
}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation1{
    String value();
}
