package org.example4.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Student {
    String name;
    int age;

    public Student(){

    }

//    @Autowired
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void viewInfo(){
        System.out.println(name + " " + age);
    }

}
