package com.nayeel.imtiaz.patterns.strategy.notification.system.v2;

public final class Call implements NotificationMethod{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
            "<<Call>> To "
            + notification.recipient()
            + ": "
            + notification.body()
            + "\n"
        );
    }
}
