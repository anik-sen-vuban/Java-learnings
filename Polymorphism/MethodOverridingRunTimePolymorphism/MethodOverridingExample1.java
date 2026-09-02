package Polymorphism.MethodOverridingRunTimePolymorphism;

class Animal{
    void sound(){
        System.out.println("Animal is sounding....");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking....");
    }
}

public class MethodOverridingExample1 {
    public static void main(String[] args) {
        // Parent reference
        Animal a;
        // Child object
        a = new Dog();
        // Child overrides parent method
        // Runtime decides which method to call
        // Runtime Polymorphism1
        a.sound();
    }
}
