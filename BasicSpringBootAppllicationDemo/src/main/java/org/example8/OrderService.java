package org.example8;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;


    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService object created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Place Order Successful");
    }
}
