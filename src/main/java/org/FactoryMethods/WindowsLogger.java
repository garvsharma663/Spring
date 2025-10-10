package org.FactoryMethods;

public class WindowsLogger implements OSLogger{
    @Override
    public void log(String message) {
        System.out.println("Windows : "+ message);
    }
}
