package org.DependencyInjection.Setter_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Marking as a Spring Bean.
public class Human {

    private Water water; // NOTE: Here Dependency is not final (can be modified).

    @Autowired // Injecting Dependency
    public void setWater(Water water){ // Setter method used for DI
        this.water = water;
    }

    public void thirst(){
        water.drink();
        System.out.println("Thirst Quenched");
    }



}
