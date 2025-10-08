package org.DependencyInjection.Setter_DI;

import org.springframework.stereotype.Component;

@Component
public class Water {
    public void drink(){
        System.out.println("Human drinks water...");
    }
}
