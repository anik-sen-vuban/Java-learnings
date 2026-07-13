public class Student {
    private String id;
    private String name;
    private Department department;
    private Course course; // null until the student registers for a course

    public Student(String id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.course = null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public String studentInfo() {
        String deptName = (department != null) ? department.getName() : "N/A";
        String courseName = (course != null) ? course.getName() : "Not registered";
        String teacherName = (course != null && course.getTeacher() != null) ? course.getTeacher().getName() : "N/A";
        String roomNumber = (course != null && course.getClassroom() != null) ? course.getClassroom().getRoomNumber() : "N/A";
        int credit = (course != null) ? course.getCredit() : 0;
        return "Student ID: " + id + " | Name: " + name + " | Department: " + deptName
                + " | Course: " + courseName + " | Teacher: " + teacherName
                + " | Classroom: " + roomNumber + " | Credit: " + credit;
    }
}