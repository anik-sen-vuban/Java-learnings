package org.example2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    PaymentService paymentService;
    //constructor1
    public OrderService(){

    }

    //constructor2
    @Autowired
    public OrderService(@Qualifier("cardPaymentService") PaymentService paymentService){
        this.paymentService = paymentService;
    }
    //@Qualifier is used when we want to explicitly choose a specific  bean

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
