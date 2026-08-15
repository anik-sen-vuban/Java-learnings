package OOP_Final_Project.StudentManagementSystem;

import java.util.ArrayList;

//Abstract class
public abstract class GradeCalculator {
    //Abstract method
    public abstract double calculateGPA(ArrayList<Course> courses);
    public abstract String calculateGrade(double gpa);

    //Non-abstract method
    public String getScholarshipStatus(double gpa){
        return gpa >= 3.75 ? "Eligible for 100% Merit Scholarship!" : gpa >= 3.50 ? "Eligible for 50% Merit Scholarship!" : "Regular tuition fees apply.";
    }
}