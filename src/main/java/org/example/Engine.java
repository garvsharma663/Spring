package org.example;

import org.springframework.stereotype.Component;

@Component // One way is this to declare this class as a Bean.
// For another way see class CarEngine.
public class Engine {
    public void engineOn(){
        System.out.println("Engine starts...");
    }

}
