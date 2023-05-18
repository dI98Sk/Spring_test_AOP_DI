package com.skakundima.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //@Qualifier("catBean")
    //@Autowired
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    //@Autowired
    public Person(Pet pet){ //Конструктор
        System.out.println("Person bean is created!");
        this.pet = pet;
    }
    /*
    public Person(@Qualifier("catBean") Pet pet){ //Конструктор
        System.out.println("Person bean is created!");
        this.pet = pet;
    }

    public Person() { //Конструктор без параметров
        System.out.println("Person bean is created!");
    }
     */



    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        System.out.println("Class person : set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person : set age");
        this.age = age;
    }
    //@Autowired
    //@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Set pet.");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet!");
        pet.say();
    }
}
