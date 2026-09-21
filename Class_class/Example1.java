package Class_class;

public class Example1 {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Anik";
//        s1.age = 25;
//        s1.viewInfo();

        //Reflection API
        Class<Student> cls = Student.class;
        //cls contains metadata about the Student class, sush as:
        //  - Class name -> Student
        //  - Fields -> name, age
        //  - Methods -> viewInfo()
        //  - Constructors -> Student()
        //  - Annotations -> @Component, @Service, etc....
        System.out.println(cls.getName()); // to see the class name
        //to see the all fields or instance variable of a classs
        for (var field : cls.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        //to see the  all methods of a Class
        for(var method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

    }
}

class Student {
    String name;
    int age;
    Student(){

    }
    void viewInfo() {
        System.out.println(name + " " + age);
    }
}