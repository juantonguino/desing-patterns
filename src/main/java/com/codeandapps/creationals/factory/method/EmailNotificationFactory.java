package com.codeandapps.creationals.factory.method;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
