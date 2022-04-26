package src.design_patterns.creational_patterns;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}

class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("Without Factory Method (Tight Coupling)::");
        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();
        smsNotification.notifyUser();
        emailNotification.notifyUser();
        pushNotification.notifyUser();
        System.out.println();

        System.out.println("With Factory Method (Loose Coupling)::");
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        notification.notifyUser();

        // TODO: How to obtain an instance of EmailNotification using factory method?
    }
}
