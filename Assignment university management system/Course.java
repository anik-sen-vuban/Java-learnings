public class Course {
    private int id;
    private String name;
    private int credit;
    private Department department;
    private Teacher teacher;
    private Classroom classroom;

    public Course(int id, String name, int credit, Department department, Teacher teacher, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.department = department;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public Department getDepartment() {
        return department;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public String courseInfo() {
        String deptName = (department != null) ? department.getName() : "N/A";
        String teacherName = (teacher != null) ? teacher.getName() : "N/A";
        String roomNumber = (classroom != null) ? classroom.getRoomNumber() : "N/A";
        return "Course ID: " + id + " | Name: " + name + " | Credit: " + credit
                + " | Department: " + deptName + " | Teacher: " + teacherName
                + " | Classroom: " + roomNumber;
    }
}