package Test_Code;

class Outer {
    int x = 10;
     class inner{
         void display(){
             System.out.println("Value of x: " + x);
         }
     }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.inner i = o.new inner();
        i.display();
    }
}
