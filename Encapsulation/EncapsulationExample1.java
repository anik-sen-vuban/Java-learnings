package Encapsulation;//Variables and methods are kept in one class.
//Data is protected using private.
//Private data cannot be accessed directly from another class.
//We use Getter and Setter methods to access private data.
//This is called Data Hiding.

class Student {

    // Main Point 1:
    // private variable (Data Hiding)
    private String name;

    // Main Point 2:
    // Setter method is used to set data
    public void setName(String name) {
        this.name = name;
    }

    // Main Point 3:
    // Getter method is used to get data
    public String getName() {
        return name;
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {

        Student student = new Student();

        // Main Point 4:
        // We cannot access private variable directly.
        // So we use setter.
        student.setName("Anik");

        // Main Point 5:
        // We use getter to read the private data.
        System.out.println(student.getName());
    }
}
