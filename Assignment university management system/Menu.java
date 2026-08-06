public class Menu {

    public static void mainMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("University Management System");
        System.out.println();
        System.out.println("1. Department Management");
        System.out.println("2. Teacher Management");
        System.out.println("3. Classroom Management");
        System.out.println("4. Course Management");
        System.out.println("5. Student Management");
        System.out.println("0. Exit");
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }

    public static void departmentMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("Department Menu");
        System.out.println();
        System.out.println("1. View Departments");
        System.out.println("2. Add Department");
        System.out.println("0. Back to Main Menu");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }

    public static void teacherMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("Teacher Menu");
        System.out.println();
        System.out.println("1. View Teachers");
        System.out.println("2. Add Teacher");
        System.out.println("0. Back to Main Menu");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }

    public static void classroomMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("Classroom Menu");
        System.out.println();
        System.out.println("1. View Classrooms");
        System.out.println("2. Add Classroom");
        System.out.println("0. Back to Main Menu");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }

    public static void courseMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("Course Menu");
        System.out.println();
        System.out.println("1. View Courses");
        System.out.println("2. Add Course");
        System.out.println("0. Back to Main Menu");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }

    public static void studentMenu() {
        ConsoleUtils.clearScreen();
        ConsoleUtils.header("Student Menu");
        System.out.println();
        System.out.println("1. View Students");
        System.out.println("2. Register New Student");
        System.out.println("0. Back to Main Menu");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ConsoleUtils.footer();
        System.out.print("\nEnter your choice: ");
    }
}