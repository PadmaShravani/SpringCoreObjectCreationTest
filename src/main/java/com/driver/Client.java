package com.driver;

import com.bean.TestClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
        ac.scan("com.bean");
        ac.refresh();
        System.out.println(ac);
        TestClass bean=ac.getBean("testClass",TestClass.class);
        System.out.println(bean);
        ac.stop();
    }
}
