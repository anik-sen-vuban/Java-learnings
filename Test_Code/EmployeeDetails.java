package Test_Code;

import java.util.Scanner;

class Employee {
    String name;
    int age;

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new  Employee();
        System.out.print("Enter Employee Name: ");
        em.name = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        em.age = sc.nextInt();
        sc.close();
        System.out.println("Enter Employee Details: ");
        em.displayDetails();
    }
}
