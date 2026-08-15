package OOP_Final_Project.StudentManagementSystem.Classes;

import java.util.ArrayList;

public class ScholarshipStudent extends GradeCalculator{
    // Overriding calculateGPA with special scholarship criteria handling
    @Override
    public double calculateGPA(ArrayList<Course> courses) {
        if (courses == null || courses.isEmpty()) {
            return 0.0;
        }

        double totalGradePoints = 0.0;
        for (Course course : courses) {
            totalGradePoints += course.getGradePoint();
        }

        double baseGpa = totalGradePoints / courses.size();

        // Scholarship students maintain strict criteria check
        return Math.round(baseGpa * 100.0) / 100.0;
    }

    // Overriding calculateGrade with Honors / Distinction remarks
    @Override
    public String calculateGrade(double gpa) {
        if (gpa >= 3.80) return "A+ [Dean's Honor List]";
        else if (gpa >= 3.50) return "A [Scholarship Maintained]";
        else if (gpa >= 3.00) return "B [Scholarship Warning: GPA < 3.5]";
        else if (gpa >= 2.00) return "C [Scholarship Suspended]";
        else return "F [Academic Probation]";
    }
}
