package OOPLabAssignment;

import java.util.Scanner;
import java.lang.String;

public class UniversityManagement {
    Scanner sc = new Scanner(System.in);

    Department[] departments = new Department[100];
    int departmentCount = 0;

    Classroom[] classrooms = new Classroom[100];
    int classroomCount = 0;

    Course[] courses = new Course[100];
    int courseCount = 0;

    Teacher[] teachers = new Teacher[100];
    int teacherCount = 0;

    Student[] students = new Student[100];
    int studentCount = 0;
//    String studentUniqueID = "232-15-" + studentCount;


    //To vew Department's info
    public void viewDepartmentInfo(){
        if(departmentCount == 0){
            System.out.println("No department found");
            return;
        }
        for(int i=0; i<departmentCount; i++){
            departments[i].viewDepartmentInfo();
        }
        return;
    }

    //To add a new department
    public void addDepartment(){
        System.out.print("Enter Department ID: ");
        String depId = sc.nextLine();
        boolean depIdExists = false;
        while(!depIdExists){
            for(int i=0; i<departmentCount; i++){
                if(departments[i].getDepId().equals(depId)){
                    depIdExists = true;
                    break;
                }
            }
            if(depIdExists){
                System.out.println("Department ID already exists. Please enter a unique Department ID.");
                System.out.print("Enter Department ID: ");
                depId = sc.nextLine();
                depIdExists = false;
            }else{
                break;
            }
        }
        System.out.print("Enter Department Name: ");
        String depName = sc.nextLine();
        Department newDepartment = new Department(depId, depName);
        departments[departmentCount++] = newDepartment;
        System.out.println("Department added successfully!");
    }

    //To update department
    public void updateDepartmentById(){
        System.out.print("Enter the DeptID to update: ");
        String dptId = sc.nextLine();
        boolean depIdExists = false;
        for(int i = 0; i < departmentCount; i++){
            if(departments[i].getDepId().equals(dptId)){
                depIdExists = true;
                System.out.print("Enter the new DeptID: ");
                dptId = sc.nextLine();
                departments[i].setDepId(dptId);
                System.out.print("Enter the new DeptNAME or remain same(enter key): ");
                String dptName = sc.nextLine();
                if(dptName == ""){
//                    departments[i].setDepName(departments[i].getDepName());
                    break;
                }
                else{
                    departments[i].setDepName(dptName);
                }


                System.out.println("Department updated successfully!");
            }
        }
        if(!depIdExists){
            System.out.println("Your DeptId is not exits...\nTry again...");
            return;
        }
    }

    //To view classroom's info
    public void viewClassroomInfo(){
        if(classroomCount == 0){
            System.out.println("No classroom found\nPlease add a classroom...");
            return;
        }
        for(int i = 0; i < classroomCount; i++){
            classrooms[i].viewClassroomInfo();
        }
    }

    //To add a classroom
    public void addClassroom(){
        System.out.print("Enter a classroom's number: ");
        int roomNo = sc.nextInt();
        boolean roomExists = false;
        while(!roomExists){
            for(int i = 0; i < classroomCount; i++){
                if(classrooms[i].getRoomNo() == roomNo){
                    roomExists = true;
                    break;
                }
            }
            if(roomExists){
                roomExists = false;
                System.out.println("Classroom number already exists. Please enter a unique classroom number");
                System.out.print("Enter a classroom's number: ");
                roomNo = sc.nextInt();
            }else{
                break;
            }
        }
        System.out.print("Enter room's capacity: ");
        int roomCapacity = sc.nextInt();
        Classroom newClassroom = new Classroom(roomNo, roomCapacity);
        classrooms[classroomCount++] = newClassroom;
        System.out.println("Classroom added successfully!");
    }

    //To update classroom's info by roomNo
    public void updateClassroomByRoomNo(){
        System.out.print("Enter classroom's number: ");
        int roomNo = sc.nextInt();
        boolean roomExists = false;
        for(int i = 0; i < classroomCount; i++){
            if(classrooms[i].getRoomNo() == roomNo){
                roomExists = true;
                System.out.print("Enter classroom's new number: ");
                roomNo = sc.nextInt();
                classrooms[i].setRoomNo(roomNo);
                System.out.print("Enter classroom's new capacity: ");
                int roomCapacity = sc.nextInt();
                classrooms[i].setCapacity(roomCapacity);
                System.out.println("Classroom updated successfully!");
                return;
            }
        }
        if(!roomExists){
            System.out.println("Your classroom's number is not exits...\nTry again...");
            return;
        }
    }

    //To vew courses's info
    public void viewCourseInfo(){
        if(courseCount == 0){
            System.out.println("No course found\nPlease add a course...");
            return;
        }
        for(int i = 0; i < courseCount; i++){
            courses[i].viewCourseInfo();
        }
    }

    //To add course
    public void addCourse(){
        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();
        boolean courseCodeExists = false;
        while(!courseCodeExists){
            for(int i = 0; i < courseCount; i++){
                if(courses[i].getCourseCode().equals(courseCode)){
                    courseCodeExists = true;
                    break;
                }
            }
            if(courseCodeExists){
                System.out.println("Course code already exists. Please enter a unique course code.");
                System.out.print("Enter course code: ");
                courseCode = sc.nextLine();
                courseCodeExists = false;
            }else{
                break;
            }
        }
        System.out.print("Enter course title: ");
        String courseTitle = sc.nextLine();
        System.out.print("Enter course credit: ");
        float courseCredit = sc.nextFloat();
        sc.nextLine(); // Consume the newline character left by nextFloat()
        if(departmentCount == 0){
            System.out.println("No department found\nPlease add a department first...");
            return;
        }
        System.out.print("Enter Department ID for the course: ");
        String depId = sc.nextLine();
        for(int i = 0; i < departmentCount; i++){
            if(departments[i].getDepId().equals(depId)){
                Department department = departments[i];
                Course newCourse = new Course(courseCode, courseTitle, courseCredit, department);
                courses[courseCount++] = newCourse;
                System.out.println("Course added successfully!");
                return;
            }
        }
        System.out.println("Department ID not found. Please add the department first.");
        return;
    }

    //To update course
    public void updateCourseInfo(){
        if(courseCount == 0){
            System.out.println("No course found\nPlease add a course first....");
            return;
        }
        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();
        boolean courseExists = false;
        for(int i = 0; i < courseCount; i++){
            if(courses[i].getCourseCode().equals(courseCode)){
                courseExists = true;
                System.out.print("Enter new course code: ");
                String newCode = sc.nextLine();
                System.out.print("Enter new course title: ");
                String newTitle = sc.nextLine();
                System.out.print("Enter new course credit: ");
                float newCredit = sc.nextFloat();
                sc.nextLine(); // Consume the newline character left by nextFloat()
                System.out.print("Enter new Department ID for the course: ");
                String newDepId = sc.nextLine();
                boolean depIdExists = false;
                for(int j = 0; j < departmentCount; j++){
                    if(departments[j].getDepId().equals(newDepId)){
                        depIdExists = true;
                        courses[i].setDepartment(departments[j]);
                        break;
                    }
                }
                if(!depIdExists){
                    System.out.println("Department ID not found. Please enter a valid department ID.");
                    return;
                }
                courses[i].setCourseCode(newCode);
                courses[i].setCourseTitle(newTitle);
                courses[i].setCredit(newCredit);
                System.out.println("Course updated successfully!");
                return;
            }
        }
        if(!courseExists){
            System.out.println("Course code not found. Please enter a valid course code.");
        }
    }

    //To view teacher's info
    public void viewTeacherInfo(){
        if(teacherCount == 0){
            System.out.println("No teachers found. Please add a teacher first....");
            return;
        }
        for(int i = 0; i < teacherCount; i++){
            teachers[i].viewTeacherInfo();
        }
    }

    //To add teacher
    public void addTeacher(){
//        System.out.print("Enter teacher ID: ");
//        String teacherId = sc.nextLine();
//        boolean teacherIdExists = false;
//        while(!teacherIdExists){
//            for(int i = 0; i < teacherCount; i++){
//                if(teachers[i].getTeacherId().equals(teacherId)){
//                    teacherIdExists = true;
//                    break;
//                }
//            }
//            if(teacherIdExists){
//                System.out.println("Teacher ID already exists. Please enter a unique teacher ID.");
//                System.out.print("Enter teacher ID: ");
//                teacherId = sc.nextLine();
//                teacherIdExists = false;
//            }else{
//                break;
//            }
//        }
        System.out.print("Enter teacher name: ");
        String name = sc.nextLine();
        System.out.print("Enter teacher designation: ");
        String designation = sc.nextLine();
        if(departmentCount == 0){
            System.out.println("No department found. Please add a department first...");
            return;
        }
        System.out.print("Enter Department ID for the teacher: ");
        String depId = sc.nextLine();
        for(int i = 0; i < departmentCount; i++){
            if(departments[i].getDepId().equals(depId)){
                Department department = departments[i];
                Teacher newTeacher = new Teacher(name+"@"+department+(teacherCount+1), name, designation, department);
                teachers[teacherCount++] = newTeacher;
                System.out.println("Teacher added successfully!");
                return;
            }
        }
        System.out.println("Department ID not found. Please add the department first.");
        return;
    }

    //To update teacher
    public void updateTeacherInfo(){
        if(teacherCount == 0){
            System.out.println("No teachers found. Please add a teacher first....");
            return;
        }
        System.out.print("Enter teacher ID: ");
        String teacherId = sc.nextLine();
        boolean teacherExists = false;
        for(int i = 0; i < teacherCount; i++){
            if(teachers[i].getTeacherId().equals(teacherId)){
                teacherExists = true;
//                System.out.print("Enter new teacher ID: ");
//                String newId = sc.nextLine();
                System.out.print("Enter new teacher name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new teacher designation: ");
                String newDesignation = sc.nextLine();
                System.out.print("Enter new Department ID for the teacher: ");
                String newDepId = sc.nextLine();
                boolean depIdExists = false;
                for(int j = 0; j < departmentCount; j++){
                    if(departments[j].getDepId().equals(newDepId)){
                        depIdExists = true;
                        teachers[i].setDepartment(departments[j]);
                        break;
                    }
                }
                if(!depIdExists){
                    System.out.println("Department ID not found. Please enter a valid department ID.");
                    return;
                }
//                teachers[i].setTeacherId(newId);
                teachers[i].setName(newName);
                teachers[i].setDesignation(newDesignation);
                System.out.println("Teacher updated successfully!");
                return;
            }
        }
        if(!teacherExists){
            System.out.println("Teacher ID not found. Please enter a valid teacher ID.");
        }
    }

    //To view student's info without results
    public void viewStudentInfo(){
        if(studentCount == 0){
            System.out.println("No students found. Please add a student first....");
            return;
        }
        for(int i = 0; i < studentCount; i++){
            students[i].viewStudentInfo();
        }
    }

    //To add student
    public void addStudent(){
//        System.out.print("Enter a unique Student ID: ");
//        String studentId = sc.nextLine();
//        boolean studentExists = false;
//        while(!studentExists){
//            for(int i = 0; i < studentCount; i++){
//                if(students[i].getStudentId().equals(studentId)){
//                    studentExists = true;
//                    break;
//                }
//            }
//            if(studentExists){
//                System.out.println("Student ID already exists. Please enter a unique Student ID.");
//                System.out.print("Enter a unique Student ID: ");
//                studentId = sc.nextLine();
//                studentExists = false;
//            }else{
//                break;
//            }
//        }
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        if(departmentCount == 0){
            System.out.println("No department found. Please add a department first...");
            return;
        }
        System.out.print("Enter Department Name: ");
        String depName = sc.nextLine();
        boolean depNameExists = false;
        Department selectedDepartment = null;
        for(int j = 0; j < departmentCount; j++){
            if(departments[j].getDepName().equalsIgnoreCase(depName)){
                depNameExists = true;
                selectedDepartment = departments[j];
                break;
            }
        }
        if(!depNameExists){
            System.out.println("Department Name not found. Please enter a valid department Name.");
            return;
        }
        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine();
        boolean courseExists = false;
        Course selectedCourse = null;
        for(int j = 0; j < courseCount; j++){
            if(courses[j].getCourseCode().equals(courseCode)){
                courseExists = true;
                selectedCourse = courses[j];
                break;
            }
        }
        if(!courseExists){
            System.out.println("Course Code not found. Please enter a valid course code.");
            return;
        }
        System.out.print("Enter Teacher ID: ");
        String teacherId = sc.nextLine();
        boolean teacherExists = false;
        Teacher selectedTeacher = null;
        for(int j = 0; j < teacherCount; j++){
            if(teachers[j].getTeacherId().equals(teacherId)){
                teacherExists = true;
                selectedTeacher = teachers[j];
                break;
            }
        }
        if(!teacherExists){
            System.out.println("Teacher ID not found. Please enter a valid teacher ID.");
            return;
        }
        System.out.print("Enter Classroom number: ");
        int classroomNo = sc.nextInt();
        boolean classroomExists = false;
        for(int j = 0; j < classroomCount; j++){
            if(classrooms[j].getRoomNo() == classroomNo){
                classroomExists = true;
                students[studentCount++] = new Student("232-15-" + studentCount, name, selectedDepartment, selectedCourse, selectedTeacher, classrooms[j]);
                System.out.println("Student added successfully!");
                return;
            }
        }
        if(!classroomExists){
            System.out.println("Classroom number not found. Please enter a valid classroom number.");
            return;
        }
    }

    //To update student
    public void updateStudentInfo(){
        if(studentCount == 0){
            System.out.println("No students found. Please add a student first....");
            return;
        }
        System.out.print("Enter Student ID to update: ");
        String studentId = sc.nextLine();
        // boolean studentIdExists = false;
        for(int i = 0; i < studentCount; i++){
            if(students[i].getStudentId().equals(studentId)){
                // studentIdExists = true;
                // Perform update operations here
                String newName, newDepName, newCourseCode, newTeacherId;
                System.out.print("Enter new Student Name: ");
                newName = sc.nextLine();
                System.out.print("Enter new Department Name: ");
                newDepName = sc.nextLine();
                boolean depNameExists = false;
                Department selectedDepartment = null;
                for(int j = 0; j < departmentCount; j++){
                    if(departments[j].getDepName().equalsIgnoreCase(newDepName)){
                        depNameExists = true;
                        selectedDepartment = departments[j];
                        break;
                    }
                }
                if(!depNameExists){
                    System.out.println("Department Name not found. Please enter a valid department Name.");
                    return;
                }
                System.out.print("Enter new Course Code: ");
                newCourseCode = sc.nextLine();
                boolean courseExists = false;
                Course selectedCourse = null;
                for(int j = 0; j < courseCount; j++){
                    if(courses[j].getCourseCode().equals(newCourseCode)){
                        courseExists = true;
                        selectedCourse = courses[j];
                        break;
                    }
                }
                if(!courseExists){
                    System.out.println("Course Code not found. Please enter a valid course code.");
                    return;
                }
                System.out.print("Enter new Teacher ID: ");
                newTeacherId = sc.nextLine();
                boolean teacherExists = false;
                Teacher selectedTeacher = null;
                for(int j = 0; j < teacherCount; j++){
                    if(teachers[j].getTeacherId().equals(newTeacherId)){
                        teacherExists = true;
                        selectedTeacher = teachers[j];
                        break;
                    }
                }
                if(!teacherExists){
                    System.out.println("Teacher ID not found. Please enter a valid teacher ID.");
                    return;
                }
                System.out.print("Enter new Classroom number: ");
                int newClassroomNo = sc.nextInt();
                boolean classroomExists = false;
                Classroom selectedClassroom = null;
                for(int j = 0; j < classroomCount; j++){
                    if(classrooms[j].getRoomNo() == newClassroomNo){
                        classroomExists = true;
                        selectedClassroom = classrooms[j];
                        students[i].setClassroom(selectedClassroom);
                        break;
                    }
                }
                if(!classroomExists){
                    System.out.println("Classroom number not found. Please enter a valid classroom number.");
                    return;
                }
                // Update student information
                students[i].setName(newName);
                students[i].setDepartment(selectedDepartment);
                students[i].setCourse(selectedCourse);
                students[i].setTeacher(selectedTeacher);
                students[i].setClassroom(selectedClassroom);
                System.out.println("Student information updated successfully!");
                return;
            }
        }
        // if(!studentIdExists){
        //     System.out.println("Student ID not found. Please enter a valid student ID.");
        // }
        System.out.println("Student ID not found. Please enter a valid student ID.");
        return;
    }
}
