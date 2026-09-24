package org.example5;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
//    private OrderService orderService;

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment Done");
//        orderService.getOderDetails();
    }
}
