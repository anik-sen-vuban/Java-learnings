package OOPLabAssignment;

public class Course {
    private String courseCode;
    private String courseTitle;
    private float credit;
    private Department department; //for associating a course with a specific department
    // private Teacher teacher; //for associating a course with a specific teacher

    //Constructor 1
    public Course(String courseCode, String courseTitle, float credit, Department department) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.department = department;
    }

    //Getters
    public String getCourseCode(){
        return courseCode;
    }
    public String getCourseTitle(){
        return courseTitle;
    }
    public float getCredit(){
        return credit;
    }
    public Department getDepartment(){
        return department;
    }
    // public Teacher getTeacher(){
    //     return teacher;
    // }

    //Setters
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    public void setCredit(float credit){
        this.credit = credit;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    // public void setTeacher(Teacher teacher){
    //     this.teacher = teacher;
    // }

    //To view course's info
    public void viewCourseInfo() {
        System.out.println("Course Code: " + courseCode + " | Course Title: " + courseTitle + " | Credit: " + credit + " | Department Name: " + department.getDepName());
    }
}
