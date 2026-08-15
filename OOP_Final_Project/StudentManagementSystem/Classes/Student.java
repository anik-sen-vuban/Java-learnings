package OOP_Final_Project.StudentManagementSystem.Classes;

import java.util.ArrayList;

// INHERITANCE: Student extends Person
public class Student extends Person{
    private String studentId;
    private String department;
    private String studentType; // "Regular" or "Scholarship"
    private ArrayList<Course> courses;

    //Default Constructor
    public Student(){

    }

    //User define Constructor
    public Student(String name, int age, String email, String studentId, String department, String studentType){
        // Calling superclass (Person) constructor using super keyword
        super(name, age, email);
        this.studentId = studentId;
        this.department = department;
        this.studentType = studentType;
        this.courses = new ArrayList<>();
    }

    //getter
    public String getStudentId(){
        return studentId;
    }
    public String getDepartment(){
        return department;
    }
    public String getStudentType(){
        return studentType;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //setter
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setStudentType(String studentType){
        this.studentType = studentType;
    }

    // Method to add a course
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    // Method to display full student details
    public void displayStudentInfo() {
        System.out.println("-----------------------------------------");
        System.out.println("Student ID   : " + studentId);
        // Using inherited getter methods from Person parent class
        System.out.println("Name         : " + getName());
        System.out.println("Age          : " + getAge());
        System.out.println("Email        : " + getEmail());
        System.out.println("Department   : " + department);
        System.out.println("Student Type : " + studentType);
        System.out.println("Courses Added: " + courses.size());
        System.out.println("-----------------------------------------");
    }
}
