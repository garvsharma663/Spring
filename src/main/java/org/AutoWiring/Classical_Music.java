package org.AutoWiring;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class Classical_Music implements MusicTypes{
    @Override
    public void musicTypes(){
        System.out.println("Classical Music is Playing now...");
    }
}
