package OOPLabAssignment;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        UniversityManagement um = new UniversityManagement();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        do{
            Menu.showMenu();
            System.out.print("Enter your choice: ");
            int selectMenuNo = sc.nextInt();
            switch(selectMenuNo){
                case 1:
                    boolean deptMenuRunning = true;
                    do{
                        Menu.showDepartmentMenu();
                        System.out.print("Enter your choice: ");
                        int selectDeptMenuNo = sc.nextInt();
                        switch(selectDeptMenuNo){
                            case 1:
                                // System.out.println("Viewing Departments....");
                                um.viewDepartmentInfo();
                                break;
                            case 2:
                                // System.out.println("Adding Department....");
                                um.addDepartment();
                                break;
                            case 3:
                                //System.out.println("Updating Department.....");
                                um.updateDepartmentById();
                                break;
                            case 0:
                                deptMenuRunning = false;
                                System.out.println("Main manu...");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(deptMenuRunning);
                    break;
                case 2:
                    boolean classMenuRunning = true;
                    do{
                        Menu.showClassroomMenu();
                        System.out.print("Enter your choice: ");
                        int selectClsMenuNo = sc.nextInt();
                        switch(selectClsMenuNo){
                            case 1:
                                // System.out.println("Viewing classroom info.....");
                                um.viewClassroomInfo();
                                break;
                            case 2:
                                // System.out.println("Adding classroom .....");
                                um.addClassroom();
                                break;
                            case 3:
                                //System.out.println("Undating classroom.....");
                                um.updateClassroomByRoomNo();
                                break;
                            case 0:
                                classMenuRunning = false;
                                System.out.println("Main menu");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(classMenuRunning);
                    break;
                case 3:
                    boolean couseMenuRunning = true;
                    do{
                        Menu.showCourseMenu();
                        System.out.print("Enter your choice: ");
                        int selectCourseMenuNo = sc.nextInt();
                        switch(selectCourseMenuNo){
                            case 1:
                                // System.out.println("Viewing Courses....");
                                um.viewCourseInfo();
                                break;
                            case 2:
                                // System.out.println("Adding Course....");
                                um.addCourse();
                                break;
                            case 3:
                                // System.out.println("Updating Course....");
                                um.updateCourseInfo();
                                break;
                            case 0:
                                couseMenuRunning = false;
                                System.out.println("Main Menu");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(couseMenuRunning);
                    break;
                case 4:
                    boolean teacherMenuRunning = true;
                    do{
                        Menu.showTeacherMenu();
                        System.out.print("Enter your choice: ");
                        int selectTeacherMenuNo = sc.nextInt();
                        switch(selectTeacherMenuNo){
                            case 1:
                                // System.out.println("Viewing Teachers....");
                                um.viewTeacherInfo();
                                break;
                            case 2:
                                // System.out.println("Adding Teacher....");
                                um.addTeacher();
                                break;
                            case 3:
                                // System.out.println("Updating Teacher....");
                                um.updateTeacherInfo();
                                break;
                            case 0:
                                teacherMenuRunning = false;
                                System.out.println("Main Menu");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(teacherMenuRunning);
                    break;
                case 5:
                    boolean studentMenuRunning = true;
                    do{
                        Menu.showStudentMenu();
                        System.out.print("Enter your choice: ");
                        int selectStudentMenuNo = sc.nextInt();
                        switch(selectStudentMenuNo){
                            case 1:
                                // System.out.println("Viewing Students....");
                                um.viewStudentInfo();
                                break;
                            case 2:
                                // System.out.println("Adding Student....");
                                um.addStudent();
                                break;
                            case 3:
                                // System.out.println("Updating Student....");
                                um.updateStudentInfo();
                                break;
                            case 0:
                                studentMenuRunning = false;
                                System.out.println("Main Menu");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(studentMenuRunning);
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank You!");
                    break;
                default :
                    System.out.println("Invalid choise");
                    break;
            }
        }while(running);
        sc.close();
    }
}
