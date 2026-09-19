package Dependency.Dependency_Injection_Example4.Services;


public class OrderService {
    private NotificationService notificationService;

    //Constructor Injection
//    public OrderService(NotificationService notificationService){
//        this.notificationService = notificationService;
//        //Now, OrderService does not create EmailService or SmsService
//    }

    //Benefit of Dependency Injection:
    //  1. Easy to Change Implementation
    //  2. Easier to test
    //  3. More Reusable Code

    // THREE types of Dependency Injection
    //  1. Constructor Injection
    //  2. Setter Injection
    //  3. Field Injection (possible in Spring)

    //Setter Injection
    public void setNotificationService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        System.out.println("Order placed successfully");
        notificationService.sendNotification();
    }
}
