package org.example2.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // is used when one implementation should be the default choice
@Component
public class UPIPaymentService implements PaymentService {
    @Override
    public void pay(){
        System.out.println("UPI payment done");
    }
}
