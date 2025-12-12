package com.nayeel.imtiaz.patterns.strategy.notification.system.v2.app;

import com.nayeel.imtiaz.patterns.strategy.notification.system.v2.NotificationSystem;
import com.nayeel.imtiaz.patterns.strategy.notification.system.v2.Notification;
import com.nayeel.imtiaz.patterns.strategy.notification.system.v2.Email;
import com.nayeel.imtiaz.patterns.strategy.notification.system.v2.Call;
import com.nayeel.imtiaz.patterns.strategy.notification.system.v2.SMS;

public class NotificationSystemDriver {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.sendNotification(new Notification("+14081234567", "Hello there!"));

        notificationSystem.changeNotificationMethod(new Email());
        notificationSystem.sendNotification(new Notification(
                "abc@gmail.com",
                "\nDear abc,\n\ngobble gobble.\n\nRegards,\nMr. Turkey"
        ));

        notificationSystem.changeNotificationMethod(new Call());
        notificationSystem.sendNotification(new Notification("+14082225555", "Voice mail"));

        notificationSystem.changeNotificationMethod(new SMS());
        notificationSystem.sendNotification(new Notification("+14081234567", "Goodbye!"));
    }
}
