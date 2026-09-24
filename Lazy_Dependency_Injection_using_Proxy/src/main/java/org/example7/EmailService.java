package org.example7;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EmailService {
    public EmailService(){
        System.out.println("Email Service created");
    }
    public void sendEmail(){
        System.out.println("Email sent successfully");
    }
}
