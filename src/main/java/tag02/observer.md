# Entwurfsmuster Beobachter (Observer) – Beispiel in Java

## Zweck
Das **Observer**-Muster definiert eine **1:n-Abhängigkeit** zwischen Objekten. Wenn sich ein Objekt (Subjekt) ändert, werden alle abhängigen Objekte (Beobachter) automatisch benachrichtigt und aktualisiert.

## Struktur (Java-Klassen)

| Komponente       | Rolle |
|----------------|--------|
| **Subject** (Subjekt) | Hält eine Liste von Beobachtern, bietet Methoden zum Hinzufügen/Entfernen. Benachrichtigt alle bei Änderung. |
| **Observer** (Beobachterschnittstelle) | Definiert die `update()`-Methode. |
| **ConcreteSubject** | Konkretes Subjekt – enthält Zustand, der überwacht wird. |
| **ConcreteObserver** | Konkreter Beobachter – reagiert auf Zustandsänderungen. |

## Vollständiges Java-Beispiel

### 1. Observer-Schnittstelle

```java
public interface Observer {
    void update(String message);
}
```

### 2. Subject-Klasse (wird beobachtet)

```java
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
```

### 3. Konkreter Beobachter 1 – E-Mail-Benachrichtigung

```java
public class EmailObserver implements Observer {
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("E-Mail an " + email + ": Neuer Status – " + message);
    }
}
```

### 4. Konkreter Beobachter 2 – Logging

```java
public class LogObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[LOG] Zustandsänderung: " + message);
    }
}
```

### 5. Hauptprogramm (Test)

```java
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer emailObs = new EmailObserver("user@example.com");
        Observer logObs = new LogObserver();

        subject.attach(emailObs);
        subject.attach(logObs);

        subject.setState("Aktiv");
        subject.setState("Inaktiv");

        subject.detach(logObs);
        subject.setState("Wartungsmodus");
    }
}
```

### Ausgabe

```
E-Mail an user@example.com: Neuer Status – Aktiv
[LOG] Zustandsänderung: Aktiv
E-Mail an user@example.com: Neuer Status – Inaktiv
[LOG] Zustandsänderung: Inaktiv
E-Mail an user@example.com: Neuer Status – Wartungsmodus
```

## Erweiterung: Mit `java.util.Observer` (veraltet, aber erwähnenswert)

Java hatte früher eingebaute Klassen `Observable` und `Observer` (seit Java 9 veraltet). Moderner ist die **manuelle Implementierung** (wie oben).

## Vor- und Nachteile

| Vorteile | Nachteile |
|----------|------------|
| Lockere Kopplung | Reihenfolge der Benachrichtigung nicht garantiert |
| Einfaches Hinzufügen neuer Beobachter | Memory Leaks bei fehlendem `detach()` |
| Unterstützt das Open/Closed-Prinzip | Kann bei vielen Beobachtern langsam sein |

## Wann in Java verwenden?

- **GUI-Frameworks** (Swing, JavaFX) – Event-Handling
- **Message-Broadcasting** (z. B. Chat-Systeme)
- **Model-View-Controller (MVC)** – View reagiert auf Model-Änderungen

## Zusammenfassung

Der Observer ist eines der **wichtigsten Entwurfsmuster in Java**, besonders für ereignisgesteuerte Anwendungen. Die manuelle Implementierung ist sauber, flexibel und leicht zu verstehen.