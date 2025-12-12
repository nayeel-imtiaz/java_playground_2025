package com.nayeel.imtiaz.patterns.strategy.notification.system.v2;

public final class Email implements NotificationMethod{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
            "<<Email>> To "
            + notification.recipient()
            + ": "
            + notification.body()
            + "\n"
        );
    }
}