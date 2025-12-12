package com.nayeel.imtiaz.patterns.strategy.notification.system.v2;

public final class NotificationSystem {
    NotificationMethod notificationMethod;

    public NotificationSystem() {
        this.notificationMethod = new SMS();
    }

    public void changeNotificationMethod(NotificationMethod notificationMethod) {
        this.notificationMethod = notificationMethod;
    }

    public void sendNotification(Notification notification) {
        notificationMethod.sendNotification(notification);
    }
}
