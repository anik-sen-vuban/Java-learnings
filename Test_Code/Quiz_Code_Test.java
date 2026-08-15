package Test_Code;

class Person{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name: " + name);
    }
}

class Student extends Person{
    String major;

    void displayinfo(){
        System.out.println("Name: " + name + ", Major: " + major);
    }
}
public class Quiz_Code_Test {
    public static void main(String[] args) {
        Person p = new Student();
        p.displayInfo();
    }
}
