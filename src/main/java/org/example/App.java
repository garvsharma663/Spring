package org.example;

import org.simpletest.TestEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example") // Goes into the package provided and
// checks for all Annotations such as @Component, @Service etc.

//NOTE: If package was same no need for @ComponentScan otherwise we must use this.

// Let's try to use both CarEngine and TestEngine classes.
@Component
public class App {
    @Autowired
    private CarEngine carEngine;

    public void samePackageEngine(){
        carEngine.enginePower(); // Works fine.
        System.out.println("Works fine on same package without @ComponentScan.");
    }
    @Autowired
    private TestEngine testEngine;
    public void diffPackageEngine(){
        testEngine.testEngine();
    }
}


