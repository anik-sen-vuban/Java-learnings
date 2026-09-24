package org.example4;

import org.example4.Classes.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example4")
public class AppConfig {
    @Bean
    public Student student(){
        return new Student("Anik", 25);
    }
}