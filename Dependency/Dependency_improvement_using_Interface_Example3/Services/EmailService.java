package Dependency.Dependency_improvement_using_Interface_Example3.Services;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(){
        System.out.println("Email Sent");
    }
}
