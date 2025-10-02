package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // It represents this class is a Bean(Spring Object) and we'll use it as per need.
public class Car {

    @Autowired // This annotation marks a dependency to be injected automatically.
    // So, instead of writing new Engine() again and again, we use this.
    private Engine engine;

    public void start(){
        engine.engineOn();
        System.out.println("Started the car...");
    }
}
