package com.codeandapps.creationals.factory.method;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Enviando notificación por correo electrónico: " + message);
    }
}
