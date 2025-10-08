package org.BeanLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Music {
    public void startMusic(){
        System.out.println("Music service ready to start...");
    }
    @PostConstruct // Used after Bean Initialization, runs setup logic after injection.
    public void musicPlays(){
        System.out.println("Music - `Believer` is now playing...");
    }

    @PreDestroy // As the name suggests used after service has done it's part and now being destroyed.
    public void musicStopped(){
        System.out.println("Music is stopped.");
    }



}
