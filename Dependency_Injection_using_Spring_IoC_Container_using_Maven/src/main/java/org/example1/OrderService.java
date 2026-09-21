package org.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component // -> tells Spring: this class is eligible to become a Spring bean
public class OrderService {
    private PaymentService paymentService;
//    private EmailService emailService;
    public OrderService(){

    }

    //Autowired tells Spring which constructor  to use for dependency injection
    @Autowired // -> if a bean has only one constructor, then the @Autowire is optional to use
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    // if need two or multiple dependency, then must be take dependency  in one constructor (@Autowired), example bellow:
//    @Autowired
//    public OrderService(PaymentService paymentService, EmailService emailService){
//        this.paymentService = paymentService;
//        this.emailService = emailService;
//    }

    //Benefits  of constructor  injection:
    //  - dependency  is mandatory
    //  - we can use final. As if, once the  dependenyc is assigned, it cannot be changed accidentally
    //          private final PaymentService paymentService;
    //  - easy to text without Spring

    //Setter Injection
//    @Autowired
//    public void setPaymentService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }
    //Setter injection is useful when a dependency is optional or can be changed after object creation
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Place Order Successfully");
    }
}
