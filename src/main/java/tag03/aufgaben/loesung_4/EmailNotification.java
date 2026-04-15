package tag03.aufgaben.loesung_4;

public class EmailNotification extends Notification {
    private final String recipient;

    public EmailNotification(String recipient, String message) {
        super(message);
        this.recipient = recipient;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
