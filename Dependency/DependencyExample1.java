package Dependency;

//Dependency is a relationship where one class uses another class to perform a task.

class Customer{
    String name;
    Customer(String name){
        this.name = name;
    }
}

class Order{
    // Dependency:
    // Order uses Customer object
//     Customer customer;
//     Order(Customer customer){
//        this.customer = customer;
//    }


    void OrderInfo(Customer customer){
        System.out.println(customer.name + " is made the order");
    }
}

public class DependencyExample1 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Anik");
        Order o1 = new Order();
        o1.OrderInfo(c1);
    }
}
