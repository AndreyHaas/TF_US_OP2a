# Entwurfsmuster: Singleton (Einzelstück)

## 1. Einleitung
Das **Singleton-Muster** ist ein Erzeugungsmuster (Creational Pattern). Es stellt sicher, dass von einer Klasse **nur genau eine Instanz** existiert und bietet einen globalen Zugriffspunkt auf diese Instanz.

## 2. Problemstellung
In vielen Anwendungen gibt es Ressourcen, die nur einmal vorhanden sein dürfen:
- Datenbankverbindung
- Logger
- Konfigurationsdatei
- Cache-Manager
- Drucker-Spooler

Ohne Singleton könnte man versehentlich mehrere Instanzen erzeugen, was zu Problemen wie mehreren offenen Datenbankverbindungen oder inkonsistenten Konfigurationen führt.

## 3. Lösung durch Singleton

### 3.1 Grundlegende Idee
- **Privater Konstruktor** – verhindert direkte Instanziierung mit `new`
- **Statische Methode** – liefert die einzige Instanz
- **Statische Variable** – speichert die einzige Instanz

## 4. Implementierungsvarianten in Java

### 4.1 Einfaches Singleton (nicht threadsicher)

```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**Nachteil:** Nicht threadsicher – zwei Threads könnten gleichzeitig `null` sehen und zwei Instanzen erzeugen.

### 4.2 Threadsicher mit synchronisierter Methode

```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**Nachteil:** Performance-Einbußen durch Synchronisation bei jedem Aufruf.

### 4.3 Eager Initialization (empfohlen für einfache Fälle)

```java
public class Singleton {
    private static final Singleton instance = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
}
```

**Vorteil:** Einfach, threadsicher. **Nachteil:** Instanz wird immer erstellt, auch wenn sie nie verwendet wird.

### 4.4 Double-Checked Locking (performant und threadsicher)

```java
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### 4.5 Bill Pugh Solution (beste Lösung)

```java
public class Singleton {
    private Singleton() {}
    
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
```

**Vorteil:** Threadsicher, lazy loading, keine Synchronisation – die Java-Ladeprogramm-Garantien werden genutzt.

## 5. Beispiel aus der Praxis: Logger

```java
public class Logger {
    private static Logger instance;
    private List<String> logs;
    
    private Logger() {
        logs = new ArrayList<>();
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        logs.add(message);
        System.out.println("[LOG] " + message);
    }
    
    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
}

// Verwendung
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.log("Anwendung gestartet");
        logger2.log("Benutzer eingeloggt");
        
        System.out.println(logger1 == logger2); // true
    }
}
```

## 6. Vor- und Nachteile

| Vorteile | Nachteile |
|----------|------------|
| + Kontrollierter Zugriff auf eine einzige Instanz | - Schwer zu testen (verdeckt Abhängigkeiten) |
| + Vermeidet mehrere Instanzen einer Ressource | - Verletzt das Single-Responsibility-Prinzip |
| + Globaler Zugriffspunkt | - Kann zu versteckten Kopplungen führen |
| + Lazy Loading möglich | - In Multithreading-Umgebungen aufwendig |
| + Spart Speicher | - Wird oft als "Anti-Pattern" kritisiert |

## 7. Wann verwendet man Singleton?

### ✅ Gute Anwendungsfälle:
- Logger
- Konfigurationsdatei (Properties)
- Datenbankverbindungspool
- Cache
- Hardware-Zugriff (Drucker, Maus)
- Thread-Pool

### ❌ Kein guter Anwendungsfall:
- Wenn die Klasse später erweitert werden soll (Verletzt Open/Closed)
- Bei Unit-Tests (wegen globalem Zustand)
- In modernen Frameworks, die Dependency Injection nutzen (Spring, Guice)

## 8. Alternative: Dependency Injection

In modernen Java-Frameworks wie **Spring** wird Singleton nicht mehr manuell implementiert. Spring verwaltet selbst standardmäßig eine Singleton-Instanz pro Bean:

```java
@Component // Spring erstellt eine Singleton-Instanz
public class MeinService {
    // Spring injiziert dieselbe Instanz überall
}
```

## 9. Singleton in verschiedenen Sprachen

### Python
```python
class Singleton:
    _instance = None
    
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
        return cls._instance
```

### C#
```csharp
public sealed class Singleton {
    private static readonly Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton Instance => instance;
}
```

### JavaScript/TypeScript
```typescript
class Singleton {
    private static instance: Singleton;
    private constructor() {}
    
    static getInstance(): Singleton {
        if (!Singleton.instance) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}
```

## 10. Fazit

Das Singleton-Muster ist eines der am häufigsten verwendeten – aber auch eines der umstrittensten Patterns. Es ist **einfach und nützlich** für globale Ressourcen, kann aber bei Unit-Tests und in großen Anwendungen zu Problemen führen.

**Empfehlung:**
- Für kleine Projekte: Verwende `Bill Pugh Solution` oder `Enum Singleton`
- Für große Projekte: Nutze **Dependency Injection** statt manuellem Singleton

```java
// Enum Singleton – die einfachste und sicherste Variante
public enum Singleton {
    INSTANCE;
    
    public void doSomething() {
        // ...
    }
}
```