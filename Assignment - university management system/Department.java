public class Department {
    private int id;
    private String name;

    //constractor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String departmentInfo() {
        int departmentId = getId();
        String departmentName = getName();
        return "Department ID: " + departmentId + " | Name: " + departmentName;
    }
}