package com.subhash.designpattern.factoryPattern;

public class NotificationFactory {

    public Notification createNotification(String notificationChannel){

        if(notificationChannel.equals("Email")){
            return new EmailNotification();
        }
        else if(notificationChannel.equals("SMS")){
            return  new SMSNotification();
        }
        else if (notificationChannel.equals("PUSH")){
            return new PushNotification();
        }
        else {
            return null;
        }
    }

}
