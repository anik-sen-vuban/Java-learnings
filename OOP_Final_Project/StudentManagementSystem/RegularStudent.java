package OOP_Final_Project.StudentManagementSystem;

import java.util.ArrayList;

public class RegularStudent extends GradeCalculator {
    // Overriding abstract method calculateGPA for Regular Students
    @Override
    public double calculateGPA(ArrayList<Course> courses) {
        if (courses == null || courses.isEmpty()) {
            return 0.0;
        }

        double totalGradePoints = 0.0;
        for (Course course : courses) {
            totalGradePoints += course.getGradePoint();
        }

        //GPA = sum of grade points / total courses
        double gpa = totalGradePoints / courses.size();
        return Math.round(gpa * 100.0) / 100.0; // Rounded to 2 decimal places
    }

    // Overriding abstract method calculateGrade
    @Override
    public String calculateGrade(double gpa) {
        if (gpa >= 4.00) return "A+ (Excellent)";
        else if (gpa >= 3.75) return "A (Very Good)";
        else if (gpa >= 3.50) return "A- (Good)";
        else if (gpa >= 3.25) return "B+ (Satisfactory)";
        else if (gpa >= 3.00) return "B (Above Average)";
        else if (gpa >= 2.75) return "B- (Average)";
        else if (gpa >= 2.50) return "C+ (Below Average)";
        else if (gpa >= 2.00) return "D (Pass)";
        else return "F (Fail)";
    }
}