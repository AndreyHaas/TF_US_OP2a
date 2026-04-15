package tag03.aufgaben.loesung_4;

public abstract class Notification {
    protected String message;

    protected Notification(String message) {
        this.message = message;
    }

    public abstract void sendNotification();
}

