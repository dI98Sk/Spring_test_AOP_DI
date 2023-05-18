package com.skakundima.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        //Pet petCat = context.getBean("catBean", Pet.class);
        //Pet petCat1 = context.getBean("catBean", Pet.class);
        //petCat.say();

        //person.callYourPet();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());


        context.close();

    }
}
