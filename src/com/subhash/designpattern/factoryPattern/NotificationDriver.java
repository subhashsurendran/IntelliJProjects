package com.subhash.designpattern.factoryPattern;

public class NotificationDriver {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification sms = notificationFactory.createNotification("SMS");
        sms.sendNotification();
    }
}
