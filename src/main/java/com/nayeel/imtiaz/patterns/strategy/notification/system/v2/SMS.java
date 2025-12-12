package com.nayeel.imtiaz.patterns.strategy.notification.system.v2;

public final class SMS implements NotificationMethod{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
            "<<SMS>> To "
            + notification.recipient()
            + ": "
            + notification.body()
            + "\n"
        );
    }
}
