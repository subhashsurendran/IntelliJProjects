package com.subhash.designpattern.factoryPattern;

public class PushNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending PUSH Notification");
    }
}
