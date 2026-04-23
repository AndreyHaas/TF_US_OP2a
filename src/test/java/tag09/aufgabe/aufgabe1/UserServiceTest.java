package tag09.aufgabe.aufgabe1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class UserServiceTest {

  @Test
  void testProcessUserValid() {
    UserService service = new UserService();
    Executable lambda = () -> service.processUser("testuser", "password123");

    // Test ist bestanden, wenn keine Exception geworfen wurde.
    // assertDoesNotThrow(methodenreferenz);
    assertDoesNotThrow(lambda);
  }

  private void processUser() {
    UserService service = new UserService();
    service.processUser("testuser", "password123");
  }

  @Test
  void testProcessUserEmptyUsername() {
    UserService service = new UserService();
    assertThrows(IllegalArgumentException.class, () -> service.processUser("", "password123"),
        "Leerer Benutzername sollte eine IllegalArgumentException werfen");

    assertThrows(IllegalArgumentException.class, () -> service.processUser(null, "password123"),
        "Leerer Benutzername sollte eine IllegalArgumentException werfen");
  }

  @Test
  void testProcessUserEmptyPassword() {
    UserService service = new UserService();
    assertThrows(IllegalArgumentException.class, () -> service.processUser("testuser", ""),
        "Leeres Passwort sollte eine IllegalArgumentException werfen");

    assertThrows(IllegalArgumentException.class, () -> service.processUser("testuser", null),
        "Leeres Passwort sollte eine IllegalArgumentException werfen");
  }
}