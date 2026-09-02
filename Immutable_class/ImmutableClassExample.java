package Immutable_class;

//RULEs of making immutable classes:
//  1. Make the class as "final"
//  2. Marks all instance variables as "private" & "final"
//  3. It won't have setter methods

public class ImmutableClassExample {
    public static void main(String[] args) {
        College c = new College("KCPSC", "Khagrachari");
        Student s1 = new Student(21, "anik", c);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege().name);

        s1.getCollege().name = "Ami School";
        System.out.println(s1.getCollege().name);
    }
}

//Immutable
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
//        this.college = college; //mutable
        this.college = new College(college.name, college.address); //defensive copy or deep copy of college (non-primitive)
    }

    //getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public College getCollege(){
//        Defensive copy
//        College c = new College(college.name, college.address);
//        return c;
        return new College(college.name, college.address);
    }
}

class College{
    String name;
    String address;
    College(String name, String address){
        this.name = name;
        this.address = address;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}