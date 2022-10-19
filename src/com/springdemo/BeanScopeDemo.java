package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("coach", Coach.class);
        Coach alphaCoach = context.getBean("coach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("\nPointing to the same object: "+ result);
        System.out.println("Memory Location for theCoach: " + theCoach);
        System.out.println("Memory Location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
