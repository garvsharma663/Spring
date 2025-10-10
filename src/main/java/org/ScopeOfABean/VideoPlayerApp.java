package org.ScopeOfABean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VideoPlayerApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfig.class);
        VideoPlayer player = context.getBean(VideoPlayer.class);

        player.playVideo();
        System.out.println();
        // ============================================================
        System.out.println("Scope check Singleton");
        VideoPlayer player1 = context.getBean(VideoPlayer.class);
        VideoPlayer player2 = context.getBean(VideoPlayer.class);

        System.out.println("Is the video player same ??");
        if(player1==player2){
            System.out.println("YES it is because of Singleton scope");
        }
        else {
            System.out.println("NOT SAME!");
        }
        System.out.println();
        // ============================================================
        System.out.println("Prototype check");

        System.out.println("Is the video file same ??");
        System.out.println();
        VideoFile videoFile1 = context.getBean(VideoFile.class);
        VideoFile videoFile2 = context.getBean(VideoFile.class);
        System.out.println();
        if(videoFile2!=videoFile1){
            System.out.println("NOT THE same because of prototype scope");
        }
        else {
            System.out.println("SAME (THIS WILL NEVER RUN)");
        }

        context.close();
    }

}
