package Object_Class_father_class_of_all_classes;

public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Object obj1 = s1;
//        System.out.println(obj1);
//        s1.setName("Anik");
//        s1.setAge(25);
//        s1.studentInfo();
        Object obj = new Student();
//        System.out.println(obj); // Student's memory address
//        System.out.println(obj.getClass());

        //Most commonly used Methods of Object class:
        //  1. Core Methods
        //      - toString()
        //      - equals()
        //      - hashCode() -> return an integer of an object
        System.out.println(obj1.hashCode());
        System.out.println(obj.hashCode());
        //      - getClass()
        //  2. Cloning
        //      - clone()
        //  3. Garbage Collection
        //      - finalige()
        //  4. Threads
        //      - wait()
        //      - notify()
        //      - notifyAll()
    }
}

class Student{
    private String name;
    private int age;

    Student(){

    }
    void setName (String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void studentInfo(){
        System.out.println("Name: " + name +"\nAge: " + age);
    }
}