# Entwurfsmuster: Factory (Fabrikmuster)

## 1. Einleitung
Das **Factory-Pattern** ist ein Erzeugungsmuster (Creational Pattern). Es bietet eine Möglichkeit, Objekte zu erstellen, ohne die genaue Klasse des zu erstellenden Objekts im Voraus kennen zu müssen. Die Verantwortung für die Objekterstellung wird an eine separate Fabrikmethode oder Factory-Klasse ausgelagert.

## 2. Problemstellung
Stellen Sie sich vor, Sie entwickeln eine Logistik-App. Sie haben verschiedene Transportmittel: LKW, Schiff, Flugzeug. Ohne Factory müssten Sie überall im Code `new LKW()`, `new Schiff()` usw. schreiben. Bei jeder neuen Transportart müssten Sie alle Stellen im Code ändern – fehleranfällig und wartungsintensiv.

## 3. Lösungen im Überblick

Es gibt drei Varianten des Factory-Patterns:

| Variante | Beschreibung |
|----------|---------------|
| **Simple Factory** | Eine zentrale Klasse entscheidet anhand eines Parameters, welches Objekt erzeugt wird |
| **Factory Method** | Eine Oberklasse definiert eine abstrakte Fabrikmethode, Unterklassen implementieren sie |
| **Abstract Factory** | Eine Factory erzeugt Familien verwandter Objekte (z. B. UI-Elemente für verschiedene Betriebssysteme) |

## 4. Beispiel 1: Simple Factory

### 4.1 Produkte (Transportmittel)

```java
// Gemeinsames Interface
interface Transport {
    void liefern();
}

// Konkrete Produkte
class LKW implements Transport {
    @Override
    public void liefern() {
        System.out.println("Lieferung per LKW auf der Straße");
    }
}

class Schiff implements Transport {
    @Override
    public void liefern() {
        System.out.println("Lieferung per Schiff auf dem Wasserweg");
    }
}

class Flugzeug implements Transport {
    @Override
    public void liefern() {
        System.out.println("Lieferung per Flugzeug in der Luft");
    }
}
```

### 4.2 Simple Factory

```java
class TransportFactory {
    public static Transport createTransport(String typ) {
        switch (typ.toLowerCase()) {
            case "lkw":
                return new LKW();
            case "schiff":
                return new Schiff();
            case "flugzeug":
                return new Flugzeug();
            default:
                throw new IllegalArgumentException("Unbekannter Transporttyp: " + typ);
        }
    }
}
```

### 4.3 Verwendung

```java
public class Main {
    public static void main(String[] args) {
        Transport transport1 = TransportFactory.createTransport("lkw");
        transport1.liefern(); // Ausgabe: Lieferung per LKW auf der Straße

        Transport transport2 = TransportFactory.createTransport("schiff");
        transport2.liefern(); // Ausgabe: Lieferung per Schiff auf dem Wasserweg
    }
}
```

## 5. Beispiel 2: Factory Method

### 5.1 Produkte (wie oben)

```java
interface Transport {
    void liefern();
}

class LKW implements Transport {
    public void liefern() { System.out.println("LKW-Lieferung"); }
}

class Schiff implements Transport {
    public void liefern() { System.out.println("Schiff-Lieferung"); }
}
```

### 5.2 Abstrakter Erzeuger mit Factory Method

```java
abstract class Logistik {
    // Factory Method
    public abstract Transport createTransport();

    // Gemeinsame Geschäftslogik
    public void planLieferung() {
        Transport transport = createTransport();
        transport.liefern();
    }
}
```

### 5.3 Konkrete Erzeuger

```java
class StrassenLogistik extends Logistik {
    @Override
    public Transport createTransport() {
        return new LKW();
    }
}

class Seelogistik extends Logistik {
    @Override
    public Transport createTransport() {
        return new Schiff();
    }
}
```

### 5.4 Verwendung

```java
public class Main {
    public static void main(String[] args) {
        Logistik logistik = new StrassenLogistik();
        logistik.planLieferung(); // LKW-Lieferung

        logistik = new Seelogistik();
        logistik.planLieferung(); // Schiff-Lieferung
    }
}
```

## 6. Beispiel 3: Abstract Factory

### 6.1 Produktfamilie: GUI-Elemente für verschiedene OS

```java
// Abstrakte Produkte
interface Button {
    void klicken();
}

interface Checkbox {
    void auswaehlen();
}

// Konkrete Produkte für Windows
class WindowsButton implements Button {
    public void klicken() { System.out.println("Windows-Button geklickt"); }
}

class WindowsCheckbox implements Checkbox {
    public void auswaehlen() { System.out.println("Windows-Checkbox ausgewählt"); }
}

// Konkrete Produkte für Mac
class MacButton implements Button {
    public void klicken() { System.out.println("Mac-Button geklickt"); }
}

class MacCheckbox implements Checkbox {
    public void auswaehlen() { System.out.println("Mac-Checkbox ausgewählt"); }
}
```

### 6.2 Abstrakte Factory

```java
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

### 6.3 Konkrete Factories

```java
class WindowsFactory implements GUIFactory {
    public Button createButton() { return new WindowsButton(); }
    public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}

class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}
```

### 6.4 Verwendung

```java
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.klicken();
        checkbox.auswaehlen();
    }

    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
```

## 7. Vor- und Nachteile

| Vorteile | Nachteile |
|----------|------------|
| + Trennung von Erzeugung und Nutzung (Single Responsibility) | - Mehr Klassen und Komplexität |
| + Einfache Erweiterbarkeit (Open/Closed-Prinzip) | - Kann bei wenigen Varianten Overkill sein |
| + Zentrale Kontrolle über die Objekterstellung | - Die Factory muss alle Produkttypen kennen |
| + Ermöglicht Dependency Injection | - Bei Abstract Factory: viele Interfaces |

## 8. Wann verwendet man welche Factory?

| Situation | Empfehlung |
|-----------|-------------|
| Nur eine Klasse, aber unterschiedliche Erstellungslogik | Simple Factory |
| Eine Methode, die verschiedene Produkte erzeugt, abhängig von Unterklassen | Factory Method |
| Familien zusammengehöriger Produkte (z. B. UI für Windows/Mac) | Abstract Factory |

## 9. Praxisbeispiele

- **Datenbankverbindungen:** `ConnectionFactory` erzeugt MySQL, PostgreSQL, Oracle
- **Dokumentengenerierung:** `DocumentFactory` erzeugt PDF, Word, HTML
- **Parser:** `ParserFactory` erzeugt JSON-, XML-, CSV-Parser
- **Logger:** `LoggerFactory` erzeugt FileLogger, ConsoleLogger, DatabaseLogger

## 10. Fazit

Das Factory-Pattern ist eines der am häufigsten verwendeten Patterns in der Praxis. Es hilft, Code sauber zu strukturieren und Abhängigkeiten zu reduzieren. Für 2–3 Varianten ist es oft übertrieben – dann reicht ein einfacher Konstruktor. Bei 5+ Varianten oder wenn die Erstellungslogik komplex wird, ist eine Factory die richtige Wahl.