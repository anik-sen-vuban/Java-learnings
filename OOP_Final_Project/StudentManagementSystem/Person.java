package OOP_Final_Project.StudentManagementSystem;

public class Person {
    private String name;
    private int age;
    private String email;

    //Default Constructor
    public Person(){
    }

    //Parameterized Constructor
    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //Display Person's info
    public void displayPersonInfo() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Email      : " + email);
    }
}
