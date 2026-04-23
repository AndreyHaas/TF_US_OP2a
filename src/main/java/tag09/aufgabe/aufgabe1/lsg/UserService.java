package tag09.aufgabe.aufgabe1.lsg;

public class UserService {
    public void processUser(String username, String password) throws IllegalArgumentException {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Benutzername darf nicht leer sein");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Passwort darf nicht leer sein");
        }
        // Benutzerinformationen verarbeiten (Hier nur ein Beispiel, könnte Datenbankoperationen beinhalten)
        System.out.println("Benutzer " + username + " wurde erfolgreich verarbeitet");
    }
}