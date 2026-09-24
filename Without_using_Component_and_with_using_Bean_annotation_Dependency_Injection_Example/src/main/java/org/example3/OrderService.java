package org.example3;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void PlaceOrder(){
        paymentService.pay();
        System.out.println("Order Place Successful");
    }
}
