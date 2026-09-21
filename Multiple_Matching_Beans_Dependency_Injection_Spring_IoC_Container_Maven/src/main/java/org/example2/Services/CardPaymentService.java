package org.example2.Services;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(){
        System.out.println("Card payment done");
    }
}
