package org.AutoWiring;

import org.springframework.stereotype.Component;

@Component("popMusic")
public class Pop_Music implements MusicTypes {
    @Override
    public void musicTypes(){
        System.out.println("Pop Music is playing now...");
    }
}
