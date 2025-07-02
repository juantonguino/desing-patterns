package com.codeandapps.creationals.factory.method;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
