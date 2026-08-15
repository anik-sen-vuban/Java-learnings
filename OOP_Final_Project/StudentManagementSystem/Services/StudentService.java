package OOP_Final_Project.StudentManagementSystem.Services;

import OOP_Final_Project.StudentManagementSystem.Classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class StudentService {
    private static Scanner scanner;
    private static int studentCnt = 2;
    // In-memory data storage using ArrayList
    private static ArrayList<Student> studentList;
    private static ArrayList<String> departmentList;
    private static HashMap<String, ArrayList<Student>> mapStudentAsDepartment;
    //    private static HashMap<String, Integer> regularScholarshipStudentCnt = new HashMap<>();
    private static HashMap<String, HashMap<String, Integer>> regularScholarshipStudentCntAsDept;

    // Constructor
    public StudentService(Scanner scanner) {
        this.studentList = new ArrayList<>();
        this.departmentList = new ArrayList<>();
        this.mapStudentAsDepartment = new HashMap<>();
        this.regularScholarshipStudentCntAsDept = new HashMap<>();
        this.scanner = scanner;
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
        loadSampleData(); // Pre-load demo students
    }

    //1. Add Student
    public static void addStudent(){
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
    public static void viewAllStudents() {
        System.out.println("\n--- ALL STUDENTS LIST ---");
        System.out.println("CSE Students: " + mapStudentAsDepartment.get("CSE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("CSE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("CSE").get("Scholarship"));
        System.out.println("SWE Students: " + mapStudentAsDepartment.get("SWE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("SWE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("SWE").get("Scholarship"));
        System.out.println("EEE Students: " + mapStudentAsDepartment.get("EEE").size() + " | Regular: " + regularScholarshipStudentCntAsDept.get("EEE").get("Regular") + " | Scholarship: " + regularScholarshipStudentCntAsDept.get("EEE").get("Scholarship"));
        System.out.println("Total Students: " + studentList.size());
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
    }

    // 3. SEARCH STUDENT
    public static void searchStudent() {
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
    public static void updateStudent(){
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
            System.out.println("4. Update Student Type");
            System.out.println("0. Exist");
            System.out.print("Choose field to update (0-4): ");

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
                case "3":

                    String oldDepartment = student.getDepartment();
                    String studentType = student.getStudentType();

                    System.out.print(
                            "Enter new Department [i.e. CSE, EEE, SWE]: "
                    );

                    String newDepartment = scanner.nextLine().trim().toUpperCase();

                    // Validate department
                    if (!departmentList.contains(newDepartment)) {
                        System.out.println("[ERROR] Invalid department.");
                        return;
                    }

                    // Check same department
                    if (oldDepartment.equals(newDepartment)) {
                        System.out.println(
                                "[ERROR] Student is already in " + newDepartment
                        );
                        return;
                    }

                    // 1. Decrease count from old department
                    regularScholarshipStudentCntAsDept
                            .get(oldDepartment)
                            .put(
                                    studentType,
                                    regularScholarshipStudentCntAsDept
                                            .get(oldDepartment)
                                            .get(studentType) - 1
                            );

                    // 2. Remove student from old department
                    mapStudentAsDepartment
                            .get(oldDepartment)
                            .remove(student);

                    // 3. Change student's department
                    student.setDepartment(newDepartment);

                    // 4. Add student to new department
                    mapStudentAsDepartment
                            .get(newDepartment)
                            .add(student);

                    // 5. Increase count in new department
                    regularScholarshipStudentCntAsDept
                            .get(newDepartment)
                            .put(
                                    studentType,
                                    regularScholarshipStudentCntAsDept
                                            .get(newDepartment)
                                            .get(studentType) + 1
                            );

                    System.out.println("Department updated successfully!");

                    break;
                case "4" :
                    String oldStudentType = student.getStudentType();
                    String studentDepartment = student.getDepartment();
                    System.out.print("Enter new Student Type[i.e. Regular, Scholarship]: ");
                    String newStudentType = scanner.nextLine().trim();
                    if (!newStudentType.equals("Regular") &&
                            !newStudentType.equals("Scholarship")) {

                        System.out.println("[ERROR] Invalid student type.");
                        break;
                    }
                    if(oldStudentType.equals(newStudentType)){
                        System.out.println("[ERROR] Student is already in " + newStudentType);
                        return;
                    }
                    student.setStudentType(newStudentType);
                    //Update the student type count
                    regularScholarshipStudentCntAsDept
                            .get(studentDepartment)
                            .put(
                                    newStudentType,
                                    regularScholarshipStudentCntAsDept
                                            .get(studentDepartment)
                                            .get(newStudentType) + 1
                            );
                    regularScholarshipStudentCntAsDept
                            .get(studentDepartment)
                            .put(
                                    oldStudentType,
                                    regularScholarshipStudentCntAsDept
                                            .get(studentDepartment)
                                            .get(oldStudentType) - 1
                            );
                    System.out.println("Student type updated successfully!");
                    break;
                case "0" :
                    optionRunning = false;
                    return;
                default :
                    System.out.println("[ERROR] Invalid selection.");
            }
        }while(optionRunning);
    }

    // 5. DELETE STUDENT
    public static void deleteStudent() {
        System.out.println("\n--- DELETE STUDENT ---");
        System.out.print("Enter Student ID to Delete: ");
        String id = scanner.nextLine().trim();
        boolean studentFound = false;
        Student student = null;
        for(Student s : studentList){
            if(s.getStudentId().equals(id)){
                studentFound = true;
                student = s;
                break;
            }
        }
        if(!studentFound){
            System.out.println("Student not found.");
            return;
        }
//        studentList.remove(student);
        mapStudentAsDepartment.get(student.getDepartment()).remove(student);
        studentList.remove(student);
        regularScholarshipStudentCntAsDept
                .get(student.getDepartment())
                .put(
                        student.getStudentType(),
                        regularScholarshipStudentCntAsDept
                                .get(student.getDepartment())
                                .get(student.getStudentType()) - 1
                );

        System.out.println("\nStudent deleted successfully.");
    }

    // 6. ADD COURSE / MARKS
    public static void addCourseAndMarks() {
        System.out.println("\n--- ADD COURSE / MARKS ---");
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();

        Student student = null;
        for(Student s : studentList){
            if(s.getStudentId().equals(id)){
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        System.out.println("\nAdding course for: " + student.getName() + " (" + student.getStudentId() + ")");

        System.out.print("Course Code (e.g. CSE101): ");
        String code = scanner.nextLine().trim();

        System.out.print("Course Name (e.g. Object Oriented Programming): ");
        String cName = scanner.nextLine().trim();

        System.out.print("Marks Obtained (0-100): ");
        double marks = scanner.nextDouble();
        scanner.nextLine();

        if (marks < 0 || marks > 100) {
            System.out.println("[ERROR] Marks must be between 0 and 100!");
            return;
        }

        Course newCourse = new Course(code, cName, marks);
        student.addCourse(newCourse);

        System.out.println("\nCourse added successfully to " + student.getName() + "'s record!");
    }

    // 7. VIEW STUDENT RESULT (Demonstrates Abstraction and Polymorphism)
    public static void viewStudentResult() {
        System.out.println("\n--- VIEW STUDENT RESULT ---");
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();

        Student student = null;
        for(Student s : studentList){
            if(s.getStudentId().equals(id)){
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        // Polymorphism: Declare reference of abstract parent class GradeCalculator
        GradeCalculator calculator;

        // Instantiate specific subclass based on student type
        if (student.getStudentType().equals("Scholarship")) {
            // Polymorphic assignment
            calculator = new ScholarshipStudent();
        } else {
            // Polymorphic assignment
            calculator = new RegularStudent();
        }

        // Pass student and calculator to Result
        Result result = new Result(student, calculator);
        result.printResultSheet();
    }


    // Pre-load initial sample data
    public static void loadSampleData() {
        Student s1 = new Student("Anik", 25, "anik232-15-1@diu.edu.bd", "232-15-1", "CSE", "Regular");
        s1.addCourse(new Course("CSE101", "Object Oriented Programming", 85.0));
        s1.addCourse(new Course("CSE102", "Data Communication", 78.0));
        Student s2 = new Student("Rahim", 22, "rahim232-15-2@diu.edu.bd", "232-15-2", "CSE", "Scholarship");
        s2.addCourse(new Course("CSE101", "Object Oriented Programming", 92.0));
        s2.addCourse(new Course("CSE103", "Algorithms & Data Structures", 88.0));

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

