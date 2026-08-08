package Abstraction;

abstract class Shape{
    String name;
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle " + name);
    }
}

public class AbstractionExample1{
    public static void main(String[] args) {
        Shape S; //abstract class can’t have any object but can have reference variable
        S = new Rectangle();
        S.name = "Abstraction.Rectangle";
        S.draw();
    }
}