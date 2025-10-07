package org.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Constructor_DI {
    @Component
    public static class Animal{
        private final Food food; // This tells us Animal needs food in order to survive,
        // i.e., final keyword used here bcz it has to be initialized (via constructor or hardcode value.)

        @Autowired
        public Animal(Food food){
            this.food = food;
        }

        public void finished(){
            food.eat();
            System.out.println("Animal Survived");
        }

    }
    @Component
    public static class Food{
        public void eat(){
            System.out.println("Animal is eating food");
        }
    }

    // Note: As I have made inner classes for this example these classes should be made static
    // in order to Spring to recognize these as Beans.
}
