package org.AutoWiring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("rockMusic") // This "rockMusic" is to be used when we're going to provide of which class we are going to inject dependency using @Qualifier.
@Primary // Marking this as Primary Bean to inject when not specified by @Qualifier.
public class Rock_Music implements MusicTypes{
    @Override
    public void musicTypes(){
        System.out.println("Rock Music is Playing now...");
    }
}
