package Dependency.Circular_Dependency_Example;

public class A {
    private B b;
    public A() {
        this.b = new B();
    }
}
