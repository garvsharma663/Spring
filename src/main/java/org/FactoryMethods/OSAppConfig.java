package org.FactoryMethods;
// Here we are going to use different way of using Bean and injecting it not the usual @Component annotation.
// The main difference between creating a Bean manually and using @Component which Spring handles itself, is
// 1.) We get to choose the logic, decide which Bean to create and how to create it.
// 2.) We can use 3rd party classes also, dynamic Beans.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OSAppConfig {
    // Here we are going to create Beans manually using @Bean Annotation.

    @Bean
    public OSLogger logger(){// Factory method which decides which Bean to give to Spring at runtime.
        String OSName = System.getProperty("os.name").toLowerCase(); // System.getProperty("os.name") ---> which os the compiler is running on.
        System.out.println("Your OS is ---> " + OSName);

        if(OSName.contains("win")){
            return new WindowsLogger(); // Using new here to create a new Object which will be registered to IoC Container by Spring at runtime.

        }
        else return new LinuxLogger();
    }

    // Now that we have the logic of which OS we're on we'll use another Bean in which the current OSLogger() is injected.
    // That's the reason we are using @Bean to create bean see.
    @Bean
    public SystemLogged systemLogged(){
        return new SystemLogged(logger()); // whichever logger() got created i.e, WindowsLogger() or LinuxLogger() will be injected into this.
    }
}
