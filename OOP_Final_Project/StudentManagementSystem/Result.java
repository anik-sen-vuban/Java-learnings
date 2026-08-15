package OOP_Final_Project.StudentManagementSystem;

import java.util.ArrayList;

public class Result {
    private Student student;
    private GradeCalculator calculator;
    // Method to display detailed student mark sheet
    public void printResultSheet() {
        System.out.println("========================================");
        System.out.println("             STUDENT RESULT             ");
        System.out.println("========================================");
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Department : " + student.getDepartment());
        System.out.println("Type       : " + student.getStudentType());
        System.out.println("----------------------------------------");

        ArrayList<Course> courses = student.getCourses();

        if (courses.isEmpty()) {
            System.out.println("No courses registered yet.");
            System.out.println("========================================");
            return;
        }

        // Display Course Marks Header
        System.out.printf("%-10s %-22s %-6s %-6s\n", "Code", "Course Name", "Marks", "Grade");
        System.out.println("----------------------------------------");

        for (Course course : courses) {
            System.out.printf("%-10s %-22s %-6.1f %-6s\n",
                    course.getCourseCode(),
                    course.getCourseName(),
                    course.getMarks(),
                    course.getLetterGrade());
        }

        System.out.println("----------------------------------------");

        // POLYMORPHISM IN ACTION:
        // calculator.calculateGPA(courses) executes DIFFERENT behavior
        // depending on whether calculator is RegularStudent or ScholarshipStudent!
        double gpa = calculator.calculateGPA(courses);
        String grade = calculator.calculateGrade(gpa);
        String scholarshipNote = calculator.getScholarshipStatus(gpa);

        System.out.println("GPA   : " + String.format("%.2f", gpa));
        System.out.println("Grade : " + grade);
        System.out.println("Remark: " + scholarshipNote);
        System.out.println("========================================\n");
    }

}
