package org.example;

import org.simpletest.TestEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"org.example", "org.simpletest"})
public class Main {
    public static void main(String[] args) {
        // To use Spring Beans in different environment from Spring i.e., main()
        // We use ApplicationContext class, it creates the IoC container and registers all beans.

        // We can provide classes to AnnotationConfigApplicationContext() OR simply <filename.class>.
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Main.class);
        Car car = applicationContext.getBean(Car.class);
        CarEngine carEngine= applicationContext.getBean(CarEngine.class);
        TestEngine testEngine = applicationContext.getBean(TestEngine.class);


        // Now we can use all Beans methods and DI's here in main.
        car.start();

        testEngine.testEngine();

        carEngine.enginePower();

        // Changed JDK and target SDK to 21 as it's compatible with it (for 23 it's not.)

    }
}