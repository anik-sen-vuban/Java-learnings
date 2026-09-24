package org.example7;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final EmailService emailService;
    public UserService(@Lazy EmailService emailService) {
        this.emailService = emailService;
        System.out.println("UserService created");
    }
    public void registerUser() {
        System.out.println("User registered");
        emailService.sendEmail();
    }
}
