package org.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Music_Player {
    private final MusicTypes musicTypes;

    @Autowired
    public Music_Player(@Qualifier("classicalMusic") MusicTypes musicTypes){ // Spring will now choose the "Classical_Music" Bean to inject in this one.
        this.musicTypes = musicTypes;
    }
    public void playMusic(){
        musicTypes.musicTypes();
    }

}
