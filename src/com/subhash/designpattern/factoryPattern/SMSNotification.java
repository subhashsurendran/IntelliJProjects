package com.subhash.designpattern.factoryPattern;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Send SMS Notification");
    }
}
