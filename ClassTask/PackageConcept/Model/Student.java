package ClassTask.PackageConcept.Model;

public class Student {
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void studentInfo(){
        System.out.println("name: " + name + "\nId: " + id);
    }
}
