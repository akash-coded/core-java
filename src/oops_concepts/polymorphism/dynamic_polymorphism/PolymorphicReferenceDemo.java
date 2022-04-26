package src.oops_concepts.polymorphism.dynamic_polymorphism;

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

public class PolymorphicReferenceDemo {
    /**
     * 
     * An object reference of a parent class or interface can
     * store the object of its child classes. This reference
     * is known as a polymorphic reference.
     * 
     * Polymorphic references can be used as:
     * - local variables
     * - data members
     * - return types of methods
     * - method parameters
     * 
     */

    private static Notification polymorphicReturnTypeMethod(String className) {
        if (className.equals("SMSNotification")) {
            return new SMSNotification();
        } else {
            return new EmailNotification();
        }
    }

    private static void polymorphicParameters(Notification notification) {
        System.out.println("The parameter is of type " + notification.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        System.out.println("Without polymorphic reference::");
        SMSNotification smsNotification = new SMSNotification();
        smsNotification.notifyUser();
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.notifyUser();
        System.out.println();

        System.out.println("With polymorphic reference::");
        Notification notification;
        notification = new SMSNotification();
        notification.notifyUser();
        notification = new EmailNotification();
        notification.notifyUser();
        System.out.println();

        System.out.println("Polymorphic return type demo::");
        Notification returnedObj1 = polymorphicReturnTypeMethod("SMSNotification");
        System.out.println(returnedObj1);
        Notification returnedObj2 = polymorphicReturnTypeMethod("EmailNotification");
        System.out.println(returnedObj2);
        System.out.println();

        System.out.println("Polymorphic parameter demo::");
        polymorphicParameters(new SMSNotification());
        polymorphicParameters(new EmailNotification());
        System.out.println();
    }
}
