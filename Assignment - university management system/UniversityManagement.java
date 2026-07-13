import java.util.Scanner;

public class UniversityManagement {

    private Department[] departments = new Department[100];
    private Teacher[] teachers = new Teacher[100];
    private Classroom[] classrooms = new Classroom[100];
    private Course[] courses = new Course[100];
    private Student[] students = new Student[100];

    private int departmentCount;
    private int teacherCount;
    private int classroomCount;
    private int courseCount;
    private int studentCount;

    // simple id generators
    private int nextDepartmentId;
    private int nextTeacherId;
    private int nextClassroomId;
    private int nextCourseId;

    // Constructor is used to initialize the UniversityManagement system, setting up counters and loading default data.
    public UniversityManagement() {
        departmentCount = 0;
        teacherCount = 0;
        classroomCount = 0;
        courseCount = 0;
        studentCount = 0;

        nextDepartmentId = 1;
        nextTeacherId = 1;
        nextClassroomId = 1;
        nextCourseId = 1;

        loadDefaultData();
    }

    // ================= DEFAULT DATA =================

    private void loadDefaultData() {
        Department cse = new Department(nextDepartmentId++, "Computer Science & Engineering");
        Department eee = new Department(nextDepartmentId++, "Electrical & Electronic Engineering");
        Department bba = new Department(nextDepartmentId++, "Business Administration");
        departments[departmentCount++] = cse;
        departments[departmentCount++] = eee;
        departments[departmentCount++] = bba;

        Teacher t1 = new Teacher(nextTeacherId++, "Dr. Rahman", "Professor", cse);
        Teacher t2 = new Teacher(nextTeacherId++, "Dr. Karim", "Associate Professor", eee);
        Teacher t3 = new Teacher(nextTeacherId++, "Dr. Sultana", "Assistant Professor", bba);
        teachers[teacherCount++] = t1;
        teachers[teacherCount++] = t2;
        teachers[teacherCount++] = t3;

        Classroom c1 = new Classroom(nextClassroomId++, "Room-101", 60);
        Classroom c2 = new Classroom(nextClassroomId++, "Room-102", 50);
        Classroom c3 = new Classroom(nextClassroomId++, "Room-103", 40);
        classrooms[classroomCount++] = c1;
        classrooms[classroomCount++] = c2;
        classrooms[classroomCount++] = c3;

        courses[courseCount++] = new Course(nextCourseId++, "Data Structures", 3, cse, t1, c1);
        courses[courseCount++] = new Course(nextCourseId++, "Algorithms", 3, cse, t1, c1);
        courses[courseCount++] = new Course(nextCourseId++, "Circuit Analysis", 3, eee, t2, c2);
        courses[courseCount++] = new Course(nextCourseId++, "Digital Electronics", 3, eee, t2, c2);
        courses[courseCount++] = new Course(nextCourseId++, "Principles of Management", 3, bba, t3, c3);
        courses[courseCount++] = new Course(nextCourseId++, "Marketing Basics", 3, bba, t3, c3);
    }

    // Reads an integer from the scanner. Reprompts on invalid input instead of crashing.
    private int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please enter digits only (e.g. 1).");
            }
        }
    }

    // ================= DEPARTMENT CRUD =================

    public void viewDepartments() {
        System.out.println("\n--- Department List ---");
        if (departmentCount == 0) {
            System.out.println("No departments available.");
            return;
        }
        for (int i = 0; i < departmentCount; i++) {
            System.out.println(departments[i].departmentInfo());
        }
    }

    // Add a new department, ensuring that the department list does not exceed its maximum capacity.
    public void addDepartment(Scanner sc) {
        if (departmentCount >= 100) {
            System.out.println("Department list is full.");
            return;
        }
        System.out.print("Enter department name: ");
        String name = sc.nextLine();
        Department d = new Department(nextDepartmentId++, name);
        departments[departmentCount++] = d;
        System.out.println("Department added successfully: " + d.departmentInfo());
    }

    // Find a department by its ID, returning the index in the array or -1 if not found.
    private int findDepartmentIndexById(int id) {
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i].getId() == id) return i;
        }
        return -1;
    }

    // Find a department by its ID, returning the Department object or null if not found.
    private Department findDepartmentById(int id) {
        int idx = findDepartmentIndexById(id);
        return (idx == -1) ? null : departments[idx];
    }

    // ================= TEACHER CRUD =================

    public void viewTeachers() {
        System.out.println("\n--- Teacher List ---");
        if (teacherCount == 0) {
            System.out.println("No teachers available.");
            return;
        }
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].teacherInfo());
        }
    }

    // Add a new teacher, linking them to a department. Validates input to ensure the department exists.
    public void addTeacher(Scanner sc) {
        if (teacherCount >= 100) {
            System.out.println("Teacher list is full.");
            return;
        }
        viewDepartments();
        int deptId = readInt(sc, "Enter department ID for this teacher: ");
        Department dept = findDepartmentById(deptId);
        if (dept == null) {
            System.out.println("Invalid department ID.");
            return;
        }
        System.out.print("Enter teacher name: ");
        String name = sc.nextLine();
        System.out.print("Enter designation: ");
        String designation = sc.nextLine();
        Teacher t = new Teacher(nextTeacherId++, name, designation, dept);
        teachers[teacherCount++] = t;
        System.out.println("Teacher added successfully: " + t.teacherInfo());
    }

    // View teachers filtered by a specific department, allowing users to see only relevant teachers.
    public void viewTeachersByDepartment(int departmentId) {
        System.out.println("\n--- Teachers in this Department ---");
        boolean found = false;
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getDepartment() != null && teachers[i].getDepartment().getId() == departmentId) {
                System.out.println(teachers[i].teacherInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No teachers available in this department.");
        }
    }

    // Find a teacher by their ID, returning the index in the array or -1 if not found.
    private int findTeacherIndexById(int id) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getId() == id) return i;
        }
        return -1;
    }

    // Find a teacher by their ID, returning the Teacher object or null if not found.
    private Teacher findTeacherById(int id) {
        int idx = findTeacherIndexById(id);
        return (idx == -1) ? null : teachers[idx];
    }

    // ================= CLASSROOM CRUD =================

    public void viewClassrooms() {
        System.out.println("\n--- Classroom List ---");
        if (classroomCount == 0) {
            System.out.println("No classrooms available.");
            return;
        }
        for (int i = 0; i < classroomCount; i++) {
            System.out.println(classrooms[i].classroomInfo());
        }
    }

    // Add a new classroom, ensuring that the classroom list does not exceed its maximum capacity. Validates input to ensure the capacity is a positive integer.
    public void addClassroom(Scanner sc) {
        if (classroomCount >= 100) {
            System.out.println("Classroom list is full.");
            return;
        }
        System.out.print("Enter room number: ");
        String roomNumber = sc.nextLine();
        int capacity = readInt(sc, "Enter capacity: ");
        Classroom c = new Classroom(nextClassroomId++, roomNumber, capacity);
        classrooms[classroomCount++] = c;
        System.out.println("Classroom added successfully: " + c);
    }

    // Find a classroom by its ID, returning the index in the array or -1 if not found.
    private int findClassroomIndexById(int id) {
        for (int i = 0; i < classroomCount; i++) {
            if (classrooms[i].getId() == id) return i;
        }
        return -1;
    }

    // Find a classroom by its ID, returning the Classroom object or null if not found.
    private Classroom findClassroomById(int id) {
        int idx = findClassroomIndexById(id);
        return (idx == -1) ? null : classrooms[idx];
    }

    // ================= COURSE CRUD =================

    // View all courses, showing their details including department, teacher, and classroom.
    public void viewCourses() {
        System.out.println("\n--- Course List ---");
        if (courseCount == 0) {
            System.out.println("No courses available.");
            return;
        }
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].courseInfo());
        }
    }

    //To view courses filtered by a specific department, allowing users to see only relevant courses.
    public void viewCoursesByDepartment(int departmentId) {
        System.out.println("\n--- Courses in this Department ---");
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getDepartment().getId() == departmentId) {
                System.out.println(courses[i].getName() + " (ID: " + courses[i].getId() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses available in this department.");
        }
    }

    // Add a new course, linking it to a department, teacher, and classroom. Validates input to ensure all references are correct.
    public void addCourse(Scanner sc) {
        if (courseCount >= 100) {
            System.out.println("Course list is full.");
            return;
        }
        viewDepartments();
        System.out.print("Enter department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();
        Department dept = findDepartmentById(deptId);
        if (dept == null) {
            System.out.println("Invalid department ID.");
            return;
        }

        viewTeachersByDepartment(deptId);
        System.out.print("Enter teacher ID: ");
        int teacherId = sc.nextInt();
        sc.nextLine();
        Teacher teacher = findTeacherById(teacherId);
        if (teacher == null) {
            System.out.println("Invalid teacher ID.");
            return;
        }

        viewClassrooms();
        System.out.print("Enter classroom ID: ");
        int classroomId = sc.nextInt();
        sc.nextLine();
        Classroom classroom = findClassroomById(classroomId);
        if (classroom == null) {
            System.out.println("Invalid classroom ID.");
            return;
        }

        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter credit: ");
        int credit = sc.nextInt();
        sc.nextLine();

        Course course = new Course(nextCourseId++, name, credit, dept, teacher, classroom);
        courses[courseCount++] = course;
        System.out.println("Course added successfully: " + course.courseInfo());
    }

    // Find a course by its ID, returning the index in the array or -1 if not found.
    private int findCourseIndexById(int id) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId() == id) return i;
        }
        return -1;
    }

    // Find a course by its ID, returning the Course object or null if not found.
    private Course findCourseById(int id) {
        int idx = findCourseIndexById(id);
        return (idx == -1) ? null : courses[idx];
    }

    // ================= STUDENT REGISTRATION =================

    public void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].studentInfo());
        }
    }

    public void registerStudent(Scanner sc) {
        if (studentCount >= 100) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        if (id.isEmpty()) {
            System.out.println("Student ID cannot be empty.");
            return;
        }
        if (findStudentIndexById(id) != -1) {
            System.out.println("A student with this ID already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        viewDepartments();
        System.out.print("Choose department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();
        Department dept = findDepartmentById(deptId);
        if (dept == null) {
            System.out.println("Invalid department ID.");
            return;
        }

        viewCoursesByDepartment(deptId);
        System.out.print("Choose course ID: ");
        int courseId = sc.nextInt();
        sc.nextLine();
        Course course = findCourseById(courseId);
        if (course == null || course.getDepartment().getId() != deptId) {
            System.out.println("Invalid course ID for this department.");
            return;
        }

        // Teacher, Classroom and Credit are automatically assigned via the Course object
        Student student = new Student(id, name, dept);
        student.setCourse(course);
        students[studentCount++] = student;

        System.out.println("Student registered successfully:");
        System.out.println(student.studentInfo());
    }

    private int findStudentIndexById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) return i;
        }
        return -1;
    }
}