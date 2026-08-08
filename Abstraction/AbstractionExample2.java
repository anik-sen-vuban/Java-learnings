package Abstraction;

abstract class Bike{
    Bike(){
        //constructor
        System.out.println("Abstraction.Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safely....");
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
//        Abstraction.Bike bike1 = new Abstraction.Bike();//Wrong, can't create a object of a abstract class
        Bike bike1 = new Honda();
        bike1.run();
        bike1.changeGear();
    }
}
