package tag03.aufgaben.loesung_4;

public class SmsNotification extends Notification {
    private final String phoneNumber;

    public SmsNotification(String phoneNumber, String message) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
