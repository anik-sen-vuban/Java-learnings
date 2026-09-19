package Dependency.Dependency_Injection_Example4.Services;


public class EmailService implements NotificationService {
    @Override
    public void sendNotification(){
        System.out.println("Email Sent");
    }
}
