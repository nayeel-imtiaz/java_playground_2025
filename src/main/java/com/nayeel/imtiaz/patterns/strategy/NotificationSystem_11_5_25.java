package com.nayeel.imtiaz.patterns.strategy;

enum Channel { EMAIL, SMS, PUSH }

// records require Java 16+
record Notification(String messageBody, String recipient, Channel channel) {}

interface NotificationSender {
    void send(Notification notification);
}

class Email implements NotificationSender {
    @Override public void send(Notification notification) {
        System.out.println("<EMAIL>: " + notification.messageBody());
    }
}

class SMS implements NotificationSender{
    @Override public void send(Notification notification) {
        System.out.println("<TEXT>: " + notification.messageBody());
    }
}

class Push implements NotificationSender {
    @Override public void send(Notification notification) {
        System.out.println("<PUSH>: " + notification.messageBody());
    }
}

class NotificationService {
    public void send(Notification notification) {
        SenderFactory.forChannel(notification.channel()).send(notification);
    }

}

final class SenderFactory {
    static NotificationSender forChannel(Channel channel) {
        return switch(channel) {
            case EMAIL -> new Email();
            case SMS -> new SMS();
            case PUSH -> new Push();
        };
    }
}

public class NotificationSystem_11_5_25 {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send(new Notification("Hello there John!", "john@gmail.com", Channel.EMAIL));
        service.send(new Notification("Sup Emily.", "+14082381457", Channel.SMS));
        service.send(new Notification("Hello. This is a reminder to come and get your flu shot", "push-token-123", Channel.PUSH));
    }
}
