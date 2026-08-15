package OOPLabAssignment;

public class Department {
    private String depId;
    private String depName;

    //constractor
    public Department(String depId, String depName){
        this.depId = depId;
        this.depName = depName;
    }

    //Getter
    public String getDepId(){
        return depId;
    }
    public String getDepName(){
        return depName;
    }

    //Setter
    public void setDepId(String depId){
        this.depId = depId;
    }
    public void setDepName(String depName){
        this.depName = depName;
    }

    //To view Dept info
    public void viewDepartmentInfo(){
        System.out.println("Department ID: " + depId + " | Department Name: " + depName);
    }
}
