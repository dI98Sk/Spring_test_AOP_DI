package com.skakundima.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = // поручили создать объект спрингу
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //
        Pet pet = context.getBean("myPet", Pet.class);
        //Pet pet = new Cat(); // создали объект сами
        // Person person = new Person(pet); // этот код делает за нас спринг
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();// обязательно нужно закрывать контекст
    }
}
