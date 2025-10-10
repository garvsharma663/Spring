package org.ScopeOfABean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Tells this Bean can be changed as we can see VideoFiles can be different each time.
public class VideoFile {
    private static int counter = 0;
    private final int id;


    public VideoFile() {
        id = ++counter;
        System.out.println("Video file number " + id + " is created...");
    }
    public void playVideoFile(){
        System.out.println("VideoFile number "+id +  " is playing...");
    }


}
