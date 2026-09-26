package org.example8;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public PaymentService(){
        System.out.println("PaymentService object created");
    }
    public void pay(){
        System.out.println("Payment done");
    }
}
