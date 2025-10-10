package org.FactoryMethods;

public class LinuxLogger implements OSLogger{
    @Override
    public void log(String message) {
        System.out.println("Linux : "+ message);
    }
}
