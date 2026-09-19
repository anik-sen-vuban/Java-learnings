package Dependency.Dependency_Tight_Coupling_Example2;

public class OrderService {

    private EmailService emailService = new EmailService();
    private SmsService smsService = new SmsService();
    // here, OrderService  depends on EmailService and SmsService
    // OrderService is tightly coupled by EmailService and SmsService

    public void placeOrder(){
        System.out.println("Order placed");
        emailService.sendEmail();
        smsService.sendSms();
    }
}
