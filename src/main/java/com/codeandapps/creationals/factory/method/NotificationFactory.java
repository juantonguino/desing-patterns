package com.codeandapps.creationals.factory.method;

public abstract class NotificationFactory {

    protected abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.notifyUser(message);
    }
}
