package org.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Configuration
//@ComponentScan("org.BeanLifecycle")
public class Lifecycle_of_a_Bean {
    // In simple words : Create → Inject Dependencies → Initialize → Use → Destroy
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Player player = context.getBean(Player.class);
        player.playerRuns();

        // For calling @PreDestroy
        context.close();
    }

}
