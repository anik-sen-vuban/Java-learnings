package Dependency.Dependency_Injection_Example4;

import Dependency.Dependency_Injection_Example4.Services.*;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new EmailService();
        NotificationService smsNotification = new SmsService();

//        Constructor Injection
//        OrderService o1 = new OrderService(smsNotification);
//        o1.placeOrder();


//        Setter Injection
        OrderService o2 = new OrderService();
        o2.setNotificationService(emailNotification);
        o2.placeOrder();
    }
}
