import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniversityManagement um = new UniversityManagement();

        ConsoleUtils.clearScreen();
        ConsoleUtils.banner();
        ConsoleUtils.pause(sc);

        boolean running = true;
        while (running) {
            Menu.mainMenu();
            int choice = readInt(sc);

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
                    ConsoleUtils.clearScreen();
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
        sc.close();
    }

    private static void departmentMenuLoop(Scanner sc, UniversityManagement um) {
        boolean back = false;
        while (!back) {
            Menu.departmentMenu();
            int choice = readInt(sc);
            switch (choice) {
                case 1: um.viewDepartments(); ConsoleUtils.pause(sc); break;
                case 2: um.addDepartment(sc); ConsoleUtils.pause(sc); break;
                // case 3: um.deleteDepartment(sc); ConsoleUtils.pause(sc); break;
                case 0: back = true; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
    }

    private static void teacherMenuLoop(Scanner sc, UniversityManagement um) {
        boolean back = false;
        while (!back) {
            Menu.teacherMenu();
            int choice = readInt(sc);
            switch (choice) {
                case 1: um.viewTeachers(); ConsoleUtils.pause(sc); break;
                case 2: um.addTeacher(sc); ConsoleUtils.pause(sc); break;
                // case 3: um.deleteTeacher(sc); ConsoleUtils.pause(sc); break;
                case 0: back = true; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
    }

    private static void classroomMenuLoop(Scanner sc, UniversityManagement um) {
        boolean back = false;
        while (!back) {
            Menu.classroomMenu();
            int choice = readInt(sc);
            switch (choice) {
                case 1: um.viewClassrooms(); ConsoleUtils.pause(sc); break;
                case 2: um.addClassroom(sc); ConsoleUtils.pause(sc); break;
                // case 3: um.deleteClassroom(sc); ConsoleUtils.pause(sc); break;
                case 0: back = true; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
    }

    private static void courseMenuLoop(Scanner sc, UniversityManagement um) {
        boolean back = false;
        while (!back) {
            Menu.courseMenu();
            int choice = readInt(sc);
            switch (choice) {
                case 1: um.viewCourses(); ConsoleUtils.pause(sc); break;
                case 2: um.addCourse(sc); ConsoleUtils.pause(sc); break;
                // case 3: um.deleteCourse(sc); ConsoleUtils.pause(sc); break;
                case 0: back = true; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
    }

    private static void studentMenuLoop(Scanner sc, UniversityManagement um) {
        boolean back = false;
        while (!back) {
            Menu.studentMenu();
            int choice = readInt(sc);
            switch (choice) {
                case 1: um.viewStudents(); ConsoleUtils.pause(sc); break;
                case 2: um.registerStudent(sc); ConsoleUtils.pause(sc); break;
                // case 3: um.deleteStudent(sc); ConsoleUtils.pause(sc); break;
                case 0: back = true; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ConsoleUtils.pause(sc);
            }
        }
    }

    // Reads an integer choice safely, returns -1 on invalid input instead of crashing.
    private static int readInt(Scanner sc) {
        String line = sc.nextLine();
        try {
            return Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}