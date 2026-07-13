import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniversityManagement um = new UniversityManagement();

        boolean running = true;
        while (running) {
            Menu.mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    departmentMenuLoop(sc, um);
                    break;
                case 2:
                    teacherMenuLoop(sc, um);
                    break;
                case 3:
                    classroomMenuLoop(sc, um);
                    break;
                case 4:
                    courseMenuLoop(sc, um);
                    break;
                case 5:
                    studentMenuLoop(sc, um);
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
    private static void departmentMenuLoop(Scanner sc, UniversityManagement um) {
        boolean running = true;
        while (running) {
            Menu.departmentMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: um.viewDepartments(); break;
                case 2: um.addDepartment(sc); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void teacherMenuLoop(Scanner sc, UniversityManagement um) {
        boolean running = true;
        while (running) {
            Menu.teacherMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: um.viewTeachers(); break;
                case 2: um.addTeacher(sc); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void classroomMenuLoop(Scanner sc, UniversityManagement um) {
        boolean running = true;
        while (running) {
            Menu.classroomMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: um.viewClassrooms(); break;
                case 2: um.addClassroom(sc); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void courseMenuLoop(Scanner sc, UniversityManagement um) {
        boolean running = true;
        while (running) {
            Menu.courseMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: um.viewCourses(); break;
                case 2: um.addCourse(sc); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void studentMenuLoop(Scanner sc, UniversityManagement um) {
        boolean running = true;
        while (running) {
            Menu.studentMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: um.viewStudents(); break;
                case 2: um.registerStudent(sc); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}