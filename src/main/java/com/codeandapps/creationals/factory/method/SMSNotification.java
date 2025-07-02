package com.codeandapps.creationals.factory.method;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Enviando notificación por SMS: " + message);
    }
}
