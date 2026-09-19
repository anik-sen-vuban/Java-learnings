package Dependency.Dependency_Injection_Example4.Services;

public class SmsService implements NotificationService {
    @Override
    public void sendNotification(){
        System.out.println("SMS sent");
    }
}
