package org.example8;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(); // for spring core
        ApplicationContext context = SpringApplication.run(Main.class, args); // for spring boot
        org.example8.OrderService orderService = context.getBean(org.example8.OrderService.class);
        orderService.placeOrder();
//        System.out.println(context);
    }
}