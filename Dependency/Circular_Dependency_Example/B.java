package Dependency.Circular_Dependency_Example;

public class B {
    private A a;
    public B(){
        this.a = new A();
    }
}
