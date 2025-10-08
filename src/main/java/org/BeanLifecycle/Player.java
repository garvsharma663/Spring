package org.BeanLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {


    private final Music music;

    @Autowired // Constructor DI
    public Player(Music music){
        this.music = music;
        System.out.println("Music Bean created.");
    }

    @PostConstruct // The logic is basically to use this, is, after the DI have been injected. But before Bean has been used by anyone.
    public void setPlayer(){
        System.out.println("Player Initialized");
    }

    public void playerRuns(){

        music.musicPlays();

    }

    @PreDestroy
    public void playerStop(){
        System.out.println("Player has been stopped!");
    }
}
