package org.example6;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton") -> Eager initialization : Create the bean during application startup
@Scope // default 'singleton'
//@Scope("prototype") // -> Lazy initialization : Create the bean only when it is actually needed
@Component
public class PaymentService {
    public PaymentService(){
        System.out.println("Bean Created");
    }
    public void pay(){
        System.out.println("Payment Successful");
    }
}
