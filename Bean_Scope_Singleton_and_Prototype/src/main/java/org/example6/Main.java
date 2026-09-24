package org.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Singleton scope example
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        PaymentService p1 = context.getBean(PaymentService.class);
//        PaymentService p2 = context.getBean(PaymentService.class);
//        System.out.println(p1 == p2); // true

        //Prototype scope example
//        PaymentService p1 = context.getBean(PaymentService.class);
//        PaymentService p2 = context.getBean(PaymentService.class);
//        System.out.println(p1 == p2); // false
    }
}

// 2 most important core scopes are:
//  1. singleton
//      -> means Spring creates exactly one object for a bean definition inside the Spring container, stores it, and returns the same object whenever needed
//      -> it is per bean definition, not per class
//          EXAMPLE:
//          @Bean
//          public User createUser() {
//          return new User();
//          }
//          @Bean
//          public User createUser2() {
//          return new User();
//          }
//      -> use for Stateless beans that provide behavior (mane kono fields thakbe na
//      -> Singleton beans are EAGERLY initialized

//  2. prototype
//      -> means Spring creates a new object every  time that bean is requested from the container
//      -> use for Stateful beans that store changing data
//      -> prototype beans are created LAZILY, when requested

// In web applications, Spring also provides:
//  - request
//  - session
//  - application
//  - websocket