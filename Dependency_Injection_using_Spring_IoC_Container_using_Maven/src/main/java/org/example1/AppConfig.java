package org.example1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // tells Spring that a class contains Spring configuration instructions
@ComponentScan("org.example1")
public class AppConfig {

}
//This class tells Spring:
//  - This is a configuration class
//  - Scan the package org.example1
//  - Find classes marked with annotations like @Component
//  - Create their  beans
//  - Wire  their dependencies

//ComponentScan tells Spring:
//  - Start scanning from org.example1
//  - Also scan its sub-packages
//  - Find classes marked with @Component, @Service, @REpository, @Controller, etc...
//  - Register them as beans
// We can write @ComponentScan without a package name, in this case, Spring scans the package where AppConfig is present and its sub-packages