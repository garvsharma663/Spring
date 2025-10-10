package org.AutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiringTypes.class);
        Music_Player musicPlayer = context.getBean(Music_Player.class);
        musicPlayer.playMusic(); // Plays Classical Song

        // We can also check different beans getting injected into MusicPlayer
        // for that just change the Qualifier OR remove it to see @Primary in action...


        // Releasing the resources after use.
        context.close();

    }
}
