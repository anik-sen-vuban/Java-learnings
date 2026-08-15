package OOP_Final_Project.StudentManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static int studentCnt = 2;
    // In-memory data storage using ArrayList
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<String> departmentList = new ArrayList<>();
    private static HashMap<String, ArrayList<Student>> mapStudentAsDepartment = new HashMap<>();
//    private static HashMap<String, Integer> regularScholarshipStudentCnt = new HashMap<>();
    private static HashMap<String, HashMap<String, Integer>> regularScholarshipStudentCntAsDept = new HashMap<>();

    public static void main(String[] args) {

        departmentList.add("CSE");
        departmentList.add("SWE");
        departmentList.add("EEE");

        for (String department : departmentList) {
            // Student list for each department
            mapStudentAsDepartment.put(department, new ArrayList<>());

            //Regular and Scholarship's Student's number for each department
            regularScholarshipStudentCntAsDept.put(department, new HashMap<>());
            regularScholarshipStudentCntAsDept
                    .get(department)
                    .put(
                            "Regular",
                            0
                    );
            regularScholarshipStudentCntAsDept
                    .get(department)
                    .put(
                            "Scholarship",
                            0
                    );
        }


        // Pre-populate system with sample data for demonstration
        loadSampleData();



        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Enter your choice: ");

            String choiceStr = scanner.nextLine().trim();

            switch (choiceStr) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    viewAllStudents();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "4":
//                    updateStudent();
                    break;
                case "5":
//                    deleteStudent();
                    break;
                case "6":
//                    addCourseAndMarks();
                    break;
                case "7":
//                    viewStudentResult();
                    break;
                case "8":
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
        System.out.println("8. Exit");
        System.out.println("----------------------------------------");
    }
    //1. Add Student
    private static void addStudent(){
        System.out.println("\n---Add New Student---");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        if(name.isEmpty()){
            System.out.println("[Error] Name cannot be empty!");
            return;
        }

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if(age <= 0 || age > 100){
            System.out.println("[ERROR] Please enter a valid age (1-100)!");
            return;
        }

        System.out.print("Enter Department (i.e. CSE, EEE, SWE): ");
        String dpt = scanner.nextLine().trim();
        if(!departmentList.contains(dpt)){
            System.out.println("[ERROR] Please enter a valid department (CSE or EEE or SWE)");
            return;
        }

        System.out.print("Enter Student Type (1 for Regular, 2 for Scholarship): ");
        String typeChoice = scanner.nextLine().trim();
        String studentType = "Regular";
        if (typeChoice.equals("2")) {
            studentType = "Scholarship";
        }

        studentCnt ++;
        String studentId = "232-15-" + studentCnt;
        String email = name + "232-15-" + studentCnt + "@diu.edu.bd";

        // Create new Student instance using constructors
        Student newStudent = new Student(name, age, email, studentId, dpt, studentType);
        studentList.add(newStudent);

        mapStudentAsDepartment.get(dpt).add(newStudent);
        regularScholarshipStudentCntAsDept
                .get(dpt)
                        .put(
                                studentType,
                                regularScholarshipStudentCntAsDept.get(dpt).get(studentType) + 1
                        );

        System.out.println("\nStudent added successfully!");

    }
    // 2. VIEW ALL STUDENTS
    private static void viewAllStudents() {
        System.out.println("\n--- ALL STUDENTS LIST ---");
        System.out.println("CSE Students: " + mapStudentAsDepartment.get("CSE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("CSE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("CSE").get("Scholarship"));
        System.out.println("SWE Students: " + mapStudentAsDepartment.get("SWE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("SWE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("SWE").get("Scholarship"));
        System.out.println("EEE Students: " + mapStudentAsDepartment.get("EEE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("EEE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("EEE").get("Scholarship"));

        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

//        for (Student student : studentList) {
//            student.displayStudentInfo();
//        }
        mapStudentAsDepartment.forEach((key, value) -> {
            if (key.equals("CSE") && !value.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("              CSE Students               ");
                for (Student student : value) {
                    student.displayStudentInfo();
                }
            } else if (key.equals("SWE") && !value.isEmpty()){
                System.out.println("-----------------------------------------");
                System.out.println("              SWE Students               ");
                for (Student student : value) {
                    student.displayStudentInfo();
                }
            } else if (!value.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("              EEE Students               ");
                for (Student student : value) {
                    student.displayStudentInfo();
                }
            }
        });

        System.out.println("Total Students: " + studentList.size());
    }

    // 3. SEARCH STUDENT
    private static void searchStudent() {
        System.out.println("\n--- SEARCH STUDENT ---");
        System.out.print("Enter Student ID to Search: ");
        String id = scanner.nextLine().trim();

        for (Student student : studentList){
            if (student.getStudentId().equals(id)){
                System.out.println("\n[STUDENT FOUND]");
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println("\nStudent not found.");
    }

    //4. UPDATE STUDENT
    private static void updateStudent(){
        System.out.println("\n--- UPDATE STUDENT ---");
        System.out.print("Enter Student ID to Update: ");
        String id = scanner.nextLine().trim();
        boolean studentExist = false;
        Student student = null;
        for (Student s : studentList){
            if(s.getStudentId().equals(id)){
                studentExist = true;
                student = s;
                break;
            }
        }
        if(!studentExist){
            System.out.println("\nStudent not found.");
            return;
        }
        boolean optionRunning = true;
        do{
            System.out.println("\nUpdating records for: " + student.getName() + " (" + student.getStudentId() + ")");
            System.out.println("1. Update Name");
            System.out.println("2. Update Age");
            System.out.println("3. Update Department");
            System.out.println("0. Exist");
            System.out.print("Choose field to update (0-3): ");

            String option = scanner.nextLine().trim();

            switch (option){
                case "1" :
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine().trim();
                    if(!newName.isEmpty()){
                        student.setName(newName);
                        System.out.println("Name updated successfully!");

                    }
                    break;
                case "2" :
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    if(newAge > 0 && newAge <= 100){
                        student.setAge(newAge);
                        System.out.println("Age updated successfully!");
                    } else{
                        System.out.println("[ERROR] Invalid age.");
                    }
                    break;
                case "3" :
                    System.out.print("Enter new Department [i.e. CSE, EEE, SWE]: ");
                    String newDepartment = scanner.nextLine().trim();
                    student.setDepartment(newDepartment);
                    break;
                case "0" :
                    optionRunning = false;
                    return;
                default :
                    System.out.println("[ERROR] Invalid selection.");
            }
        }while(optionRunning);
    }

    // Pre-load initial sample data
    private static void loadSampleData() {
        Student s1 = new Student("Anik", 25, "anik232-15-1@diu.edu.bd", "232-15-1", "CSE", "Regular");
//        s1.addCourse(new Course("CSE101", "Object Oriented Programming", 85.0));
//        s1.addCourse(new Course("CSE102", "Data Communication", 78.0));
        Student s2 = new Student("Rahim", 22, "rahim232-15-2@diu.edu.bd", "232-15-2", "CSE", "Scholarship");
//        s2.addCourse(new Course("CSE101", "Object Oriented Programming", 92.0));
//        s2.addCourse(new Course("CSE103", "Algorithms & Data Structures", 88.0));

        studentList.add(s1);
        studentList.add(s2);
        mapStudentAsDepartment.get(s1.getDepartment()).add(s1);
        mapStudentAsDepartment.get(s2.getDepartment()).add(s2);

        for (Student student : studentList){
            regularScholarshipStudentCntAsDept
                    .get(student.getDepartment())
                    .put(
                            student.getStudentType(),
                            regularScholarshipStudentCntAsDept
                                    .get(student.getDepartment())
                                    .get(student.getStudentType()) + 1
                    );
        }
    }
}
