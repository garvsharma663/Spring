package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CarEngine {
    public void enginePower(){
        System.out.println("Engine is Powerful.");
    }
}
