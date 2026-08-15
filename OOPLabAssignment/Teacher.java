package OOPLabAssignment;

public class Teacher {
    private String teacherId;
    private String name;
    private String designation;
    private Department department; // Association with Department class

    //Constructor
    public Teacher(String teacherId, String name, String designation, Department department) {
        this.teacherId = teacherId;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    //Getters
    public String getTeacherId() {
        return teacherId;
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public Department getDepartment() {
        return department;
    }

    //Setters
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    //To display teacher's info
    public void viewTeacherInfo() {
        System.out.println("Teacher ID: " + teacherId + "| Name: " + name + "| Designation: " + designation + "| Department: " + department.getDepName());
    }
}