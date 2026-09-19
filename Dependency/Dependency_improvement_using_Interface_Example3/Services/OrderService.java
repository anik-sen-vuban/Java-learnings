package Dependency.Dependency_improvement_using_Interface_Example3.Services;

public class OrderService {
    private NotificationService notificationService = new EmailService();
    //OrderService depends on the  interface instead  of a concrete class
    //It is still deciding which implementation to use

    //Creating objects is not the  problem
    //Creating them in the wrong place is the problem

    //OrderService is a business class. Its job should be order-related logic, not deciding which notification object to create
    //This breaks TWO important principles:
    //  1. S -> Single Responsibility Principle : One class should have one main job
    //  2. O -> Open-Close Principle : We should be able to add new features without changing the old code

    //Solution : Dependency Injection (see example 4)
    public void placeOrder(){
        System.out.println("Order placed successfully");
        notificationService.sendNotification();
    }
}
