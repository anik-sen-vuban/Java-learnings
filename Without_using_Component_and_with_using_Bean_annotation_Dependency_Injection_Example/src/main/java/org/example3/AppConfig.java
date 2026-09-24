package org.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example3")
public class AppConfig {
//    @Bean
    @Bean("myPaymentService")
    public PaymentService paymentService(){
        return new PaymentService();
    }

//    @Bean
//    public OrderService orderService(PaymentService paymentService){
//        return new OrderService(paymentService);
//    }
    @Bean
    public OrderService orderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
