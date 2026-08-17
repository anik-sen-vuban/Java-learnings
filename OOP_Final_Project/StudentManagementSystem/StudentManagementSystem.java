package OOP_Final_Project.StudentManagementSystem;

import OOP_Final_Project.StudentManagementSystem.Classes.*;
import OOP_Final_Project.StudentManagementSystem.Services.StudentService;


import java.util.Scanner;

public class StudentManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
//    private static StudentService studentService = new StudentService(scanner);
    public static void main(String[] args) {
        StudentService studentService = new StudentService(scanner);
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Enter your choice: ");

            String choiceStr = scanner.nextLine().trim();

            switch (choiceStr) {
                case "1":
                    studentService.addStudent();
                    break;
                case "2":
                    studentService.viewAllStudents();
                    break;
                case "3":
                    studentService.searchStudent();
                    break;
                case "4":
                    studentService.updateStudent();
                    break;
                case "5":
                    studentService.deleteStudent();
                    break;
                case "6":
                    studentService.addCourseAndMarks();
                    break;
                case "7":
                    studentService.viewStudentResult();
                    break;
                case "0":
                    running = false;
                    System.out.println("\nThank you for using Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("\n[ERROR] Invalid choice! Please enter a number between 1 and 8.");
            }
        }
        scanner.close();
    }
    // Display Console Menu
    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("       STUDENT MANAGEMENT SYSTEM        ");
        System.out.println("========================================");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Add Course / Marks");
        System.out.println("7. View Student Result");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------");
    }
}
