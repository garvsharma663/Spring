package org.FactoryMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.FactoryMethods")
public class OSLogApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(OSAppConfig.class);
        SystemLogged systemLogged = context.getBean(SystemLogged.class);

        systemLogged.startOS();

        context.close();
    }
}
