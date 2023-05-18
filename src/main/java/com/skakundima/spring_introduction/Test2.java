package com.skakundima.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {//
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");//создщали спринг контейнер

        Pet pet = context.getBean("myPet",Pet.class);
        pet.say();
        context.close();
    }
}
