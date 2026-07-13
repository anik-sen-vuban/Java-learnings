public class Menu {

    public static void mainMenu() {
        System.out.println("\n===== UNIVERSITY MANAGEMENT SYSTEM =====");
        System.out.println("1. Department Management");
        System.out.println("2. Teacher Management");
        System.out.println("3. Classroom Management");
        System.out.println("4. Course Management");
        System.out.println("5. Student Management");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void departmentMenu() {
        System.out.println("\n--- Department Management ---");
        System.out.println("1. View Departments");
        System.out.println("2. Add Department");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public static void teacherMenu() {
        System.out.println("\n--- Teacher Management ---");
        System.out.println("1. View Teachers");
        System.out.println("2. Add Teacher");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public static void classroomMenu() {
        System.out.println("\n--- Classroom Management ---");
        System.out.println("1. View Classrooms");
        System.out.println("2. Add Classroom");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public static void courseMenu() {
        System.out.println("\n--- Course Management ---");
        System.out.println("1. View Courses");
        System.out.println("2. Add Course");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public static void studentMenu() {
        System.out.println("\n--- Student Management ---");
        System.out.println("1. View Students");
        System.out.println("2. Register New Student");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }
}