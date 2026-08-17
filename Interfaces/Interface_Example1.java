package Interfaces;

interface Animal {

    void sound();   // abstract method
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}

public class Interface_Example1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
