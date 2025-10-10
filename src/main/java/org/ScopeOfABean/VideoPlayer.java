package org.ScopeOfABean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // Tells this Bean Scope is global and this cannot be changed.
public class VideoPlayer {
    private final VideoFile videoFile;
        @Autowired
        VideoPlayer(VideoFile videoFile){
            this.videoFile = videoFile;
        }

        public void playVideo(){
            System.out.println("Video Player is running now...");
            videoFile.playVideoFile();
        }
}
