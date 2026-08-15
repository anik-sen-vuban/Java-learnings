package OOP_Final_Project.StudentManagementSystem.Classes;

public class Course {
    private String courseCode;
    private String courseName;
    private double marks;

    //Default Constructor
    public Course(){

    }
    //User define Constructor
    public Course(String courseCode, String courseName, double marks){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.marks = marks;
    }

    //Getters
    public String getCourseCode(){
        return courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public double getMarks(){
        return marks;
    }

    //Setters
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

    //Convert course marks to grade point
    public double getGradePoint(){
        return marks >= 80 ? 4.00 : marks >= 75 ? 3.75 : marks >= 70 ? 3.50 : marks >= 65 ? 3.25 : marks >= 60 ? 3.00 : marks >= 55 ? 2.75 : marks >= 50 ? 2.50 : marks >= 40 ? 2.00 : 0.00;
    }

    //Get letter grade for the course
    public String getLetterGrade() {
        if (marks >= 80) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 70) return "A-";
        else if (marks >= 65) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 55) return "B-";
        else if (marks >= 50) return "C+";
        else if (marks >= 40) return "D";
        else return "F";
    }
}
