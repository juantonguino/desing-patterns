package com.codeandapps.creationals.factory.method;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=getNotificationFactory("SMS");
        notificationFactory.sendNotification("Hello, this is a test SMS notification!");
        NotificationFactory notificationFactoryEmail=getNotificationFactory("EMAIL");
        notificationFactoryEmail.sendNotification("Hello, this is a test Email notification!");
    }

    public static NotificationFactory getNotificationFactory(String type) {
        return switch (type){
            case "SMS" -> new SMSNotificationFactory();
            case "EMAIL" -> new EmailNotificationFactory();
            default -> throw new IllegalArgumentException("Invalid notification type");
        };
    }
}
