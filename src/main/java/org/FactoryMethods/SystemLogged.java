package org.FactoryMethods;
import org.FactoryMethods.OSAppConfig;

public class SystemLogged {
    private final OSLogger osLogger;

    SystemLogged(OSLogger osLogger){
        this.osLogger = osLogger;
    }

    public void startOS(){
        osLogger.log("System Logger is started ...");
    }
}
