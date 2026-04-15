package tag03.aufgaben.loesung_4;

/*
 * In Ihrer Anwendung benötigen Sie eine Möglichkeit, dynamisch Benachrichtigungen für Kunden zu erzeugen.
 * Kunden können dabei über eMail oder SMS benachrichtigt werden.
 * Die Benachrichtigungen werden über die Klassen EmailNotification und SmsNotification repräsentiert.
 * Für die eMail Benachrichtigung wird die Adresse und die Nachricht benötigt, für die SMS die Nummer und die Nachricht.
 *
 * Zum Erzeugen der Benachrichtigungen wählen Sie das Fabrik-Muster.
 * Mit der Klasse NotificationFactory und der createNotification-Methode können Benachrichtigungen anhand der übergebenen Informationen erstellt werden.
 * Wird der Methode "email" übergeben, wird eine EmailNotification und über "sms" eine SmsNotification erzeugt und zurückgegeben.

 */

public class Loesung_4 {
    public static void main(String[] args) {
        try {
            // Create an email notification
            Notification emailNotification = NotificationFactory.createNotification("email", "john@example.com", "Hello from our app!");

            // Send the email notification
            emailNotification.sendNotification();

            // Create an SMS notification
            Notification smsNotification = NotificationFactory.createNotification("sms", "+1234567890", "Hello from our app!");

            // Send the SMS notification
            smsNotification.sendNotification();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}