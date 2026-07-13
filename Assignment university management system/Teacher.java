public class Teacher {
    private int id;
    private String name;
    private String designation;
    private Department department;

    public Teacher(int id, String name, String designation, Department department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    //Getters
    public int getId() {
        return id;
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

    public String teacherInfo() {
        // String deptName = (department != null) ? department.getName() : "N/A";
        return "Teacher ID: " + id + " | Name: " + name + " | Designation: " + designation + " | Department: " + department.getName();
    }
}