package org.example5;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    //auto wiring
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        getOderDetails();
        System.out.println("Place Order Successful");
    }

    public void getOderDetails(){
        System.out.println("Order Details");
    }

}
