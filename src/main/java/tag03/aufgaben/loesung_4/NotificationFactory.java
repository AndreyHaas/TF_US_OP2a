package tag03.aufgaben.loesung_4;

public class NotificationFactory {
    public static Notification createNotification(String type, String contact, String message) throws Exception {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification(contact, message);
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification(contact, message);
        }

        throw new Exception("Invalid notification type.");
    }
}