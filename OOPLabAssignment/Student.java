package OOPLabAssignment;

public class Student {
    private String studentId;
    private String name;
    private float cgpa;
    private Department department; // Association with Department class
    private Course course; // Association with Course class
    private Teacher teacher; // Association with Teacher class
    private Classroom classroom; // Association with Classroom class

    // Constructor for resutls
    public Student(String studentId, String name, float cgpa, Department department, Course course) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
        this.course = course;
    }

    // Constructor for student info
    public Student(String studentId, String name, Department department, Course course, Teacher teacher, Classroom classroom){
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.course = course;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    //Getters
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public float getCgpa() {
        return cgpa;
    }
    public Department getDepartment() {
        return department;
    }
    public Course getCourse() {
        return course;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Classroom getClassroom() {
        return classroom;
    }

    //Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    //To view student's info without results
    public void viewStudentInfo() {
        System.out.println("Student ID: " + studentId + "| Name: " + name + " | Department: " + department.getDepName() + "| Course: " + course.getCourseTitle() + "| Teacher: " + teacher.getName() + " | Classroom: " + classroom.getRoomNo());
    }

    //To view student's info with results
    public void viewStudentInfoWithResults() {
        System.out.println("Student ID: " + studentId + "| Name: " + name + " | CGPA: " + cgpa + " | Department: " + department.getDepName() + "| Course: " + course.getCourseTitle());
    }
}

