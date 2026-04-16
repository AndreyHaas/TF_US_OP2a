# Adapter-Muster (Adapter Pattern)

## Zweck

Das **Adapter-Muster** ist ein **Strukturmuster**. Es ermoeglicht die Zusammenarbeit von Klassen mit **inkompatiblen Schnittstellen**.

## Problem

Stellen Sie sich vor:

- Sie haben eine **existierende Klasse** (z.B. aus einer Bibliothek)
- Ihre Anwendung erwartet eine **bestimmte Schnittstelle**
- Die existierende Klasse passt **nicht** zu dieser Schnittstelle
- Sie koennen die existierende Klasse **nicht aendern**

## Lösung

Ein **Adapter** fungiert als **Vermittler**:

```
[Ihre Anwendung] ----erwartet----> [Ziel-Schnittstelle]
↑
│
[ADAPTER]
↑
│
[externe Bibliothek] ----bietet----> [andere Schnittstelle]
```

## Struktur

```
┌─────────────────────────────────────────────────────────────────┐
│                        ADAPTER-MUSTER                            │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│  ┌──────────────┐     ┌─────────────────────┐                   │
│  │   Client     │────▶│  <<Interface>>      │                   │
│  │              │     │  ZielSchnittstelle  │                   │
│  └──────────────┘     │  + anfrage()        │                   │
│                       └──────────▲──────────┘                   │
│                                  │                              │
│                       ┌──────────┴──────────┐                   │
│                       │                     │                   │
│                  ┌────┴────┐          ┌─────┴─────┐             │
│                  │ Adapter │          │  Adaptee  │             │
│                  │         │          │ (existent)│             │
│                  │+ anfrage│─────────▶│+ spezifisch│            │
│                  └─────────┘          │  Anfrage()│             │
│                                       └───────────┘             │
└─────────────────────────────────────────────────────────────────┘
```

## Komponenten

| Komponente | Beschreibung |
|------------|--------------|
| **Client** | Die Anwendung, die eine bestimmte Schnittstelle erwartet |
| **ZielSchnittstelle (Target)** | Das Interface, das der Client verwendet |
| **Adapter** | Uebersetzt zwischen Ziel und Adaptee |
| **Adaptee** | Die existierende Klasse mit inkompatibler Schnittstelle |

## Beispiel in Java

### Problem: Inkompatible Schnittstellen

```java
// Das Interface, das unsere Anwendung erwartet
interface Zahlungsdienst {
    void bezahlen(double betrag, String waehrung);
}

// Eine externe Bibliothek (kann nicht geaendert werden!)
class ExternerZahlungsanbieter {
    public void sendeZahlung(float geldbetrag, String zahlungsmittel) {
        System.out.println("Zahlung ueber " + geldbetrag + " " + zahlungsmittel);
    }
}

// UNSERE ANWENDUNG - erwartet Zahlungsdienst
class OnlineShop {
    private Zahlungsdienst zahlungsdienst;
    
    public OnlineShop(Zahlungsdienst zd) {
        this.zahlungsdienst = zd;
    }
    
    public void kaufen(double preis) {
        zahlungsdienst.bezahlen(preis, "EUR");
    }
}

// Das funktioniert NICHT:
ExternerZahlungsanbieter extern = new ExternerZahlungsanbieter();
OnlineShop shop = new OnlineShop(extern); // ❌ Compiler-Fehler!
```

### Lösung mit Adapter

```java
// 1. ZIEL-SCHNITTSTELLE (Target)
interface Zahlungsdienst {
    void bezahlen(double betrag, String waehrung);
}

// 2. ADAPTEE (externe, unveraenderbare Klasse)
class ExternerZahlungsanbieter {
    public void sendeZahlung(float geldbetrag, String zahlungsmittel) {
        System.out.println("Zahlung ueber " + geldbetrag + " " + zahlungsmittel);
    }
}

// 3. ADAPTER - uebersetzt zwischen Ziel und Adaptee
class ZahlungsAdapter implements Zahlungsdienst {
    private ExternerZahlungsanbieter externerAnbieter;
    
    public ZahlungsAdapter(ExternerZahlungsanbieter externer) {
        this.externerAnbieter = externer;
    }
    
    @Override
    public void bezahlen(double betrag, String waehrung) {
        // Uebersetzung: double → float, "EUR" → "Euro"
        float konvertierterBetrag = (float) betrag;
        String zahlungsmittel = waehrung.equals("EUR") ? "Euro" : waehrung;
        
        externerAnbieter.sendeZahlung(konvertierterBetrag, zahlungsmittel);
    }
}

// 4. CLIENT - verwendet den Adapter
public class OnlineShopDemo {
    public static void main(String[] args) {
        // Externen Anbieter erstellen
        ExternerZahlungsanbieter extern = new ExternerZahlungsanbieter();
        
        // Adapter erstellen
        ZahlungsAdapter adapter = new ZahlungsAdapter(extern);
        
        // Shop mit Adapter nutzen
        OnlineShop shop = new OnlineShop(adapter);
        shop.kaufen(29.99);
        
        // Ausgabe: "Zahlung ueber 29.99 Euro"
    }
}
```

## Beispiel aus Ihrer Bäckerei

```java
// Problem: Unterschiedliche Kundenschnittstellen

// Was die Bäckerei erwartet
interface BaeckereiKunde {
    String getName();
    String getGeburtstag();
}

// Externe Kundendatenbank (kann nicht geaendert werden)
class ExterneKundenDB {
    public String vollerName;
    public int geburtsTag;
    public int geburtsMonat;
    public int geburtsJahr;
}

// Adapter
class KundeAdapter implements BaeckereiKunde {
    private ExterneKundenDB externerKunde;
    
    public KundeAdapter(ExterneKundenDB externer) {
        this.externerKunde = externer;
    }
    
    @Override
    public String getName() {
        return externerKunde.vollerName;
    }
    
    @Override
    public String getGeburtstag() {
        return externerKunde.geburtsTag + "." + 
               externerKunde.geburtsMonat + "." + 
               externerKunde.geburtsJahr;
    }
}

// Anwendung
ExterneKundenDB dbKunde = new ExterneKundenDB();
dbKunde.vollerName = "Anna Schmidt";
dbKunde.geburtsTag = 15;
dbKunde.geburtsMonat = 3;
dbKunde.geburtsJahr = 1990;

BaeckereiKunde kunde = new KundeAdapter(dbKunde);
System.out.println(kunde.getName());        // "Anna Schmidt"
System.out.println(kunde.getGeburtstag());  // "15.3.1990"
```

## Zwei Arten von Adaptern

| Art | Beschreibung | Vorteil |
|-----|--------------|---------|
| **Klassen-Adapter** | Verwendet Vererbung (Adapter erbt von Adaptee) | Kann Methoden ueberschreiben |
| **Objekt-Adapter** | Verwendet Komposition (Adapter haelt Adaptee als Feld) | Flexibler, da mit mehreren Adaptees |

### Objekt-Adapter (empfohlen)

```java
class ObjektAdapter implements ZielInterface {
    private Adaptee adaptee;  // Komposition
    
    public ObjektAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    public void anfrage() {
        adaptee.spezifischeAnfrage();
    }
}
```

### Klassen-Adapter (nur bei Mehrfachvererbung)

```java
class KlassenAdapter extends Adaptee implements ZielInterface {
    public void anfrage() {
        this.spezifischeAnfrage();
    }
}
```

## Vor- und Nachteile

| Vorteile | Nachteile |
|----------|-----------|
| ✅ **Single Responsibility** – Trennt Schnittstellenkonvertierung | ❌ Erhoeht Komplexitaet durch zusaetzliche Klassen |
| ✅ **Open/Closed-Prinzip** – Neuen Adapter hinzufuegen ohne bestehenden Code zu aendern | ❌ Kann schwer zu lesen sein (Umwege im Code) |
| ✅ **Wiederverwendbarkeit** – Existierenden Code kann man nutzen | ❌ Bei Klassen-Adapter: Bindung an konkrete Klasse |
| ✅ **Lose Kopplung** – Client kennt nur das Ziel-Interface | |

## Wann verwenden?

- ✅ Wenn Sie eine **externe Bibliothek** nutzen moechten, die nicht zu Ihrer Schnittstelle passt
- ✅ Wenn Sie **alten Code** mit **neuem Code** verbinden moechten
- ✅ Wenn Sie eine **einheitliche Schnittstelle** fuer verschiedene Implementierungen bieten moechten
- ✅ Wenn Sie Code **wiederverwenden** moechten, den Sie nicht aendern koennen

## Vergleich mit anderen Mustern

| Muster | Unterschied |
|--------|-------------|
| **Adapter** | Macht zwei bestehende Schnittstellen kompatibel |
| **Bridge** | Trennt Abstraktion von Implementierung (von Anfang an geplant) |
| **Facade** | Bietet eine vereinfachte Schnittstelle fuer ein komplexes System |
| **Decorator** | Fuegt einem Objekt neue Funktionalitaet hinzu |

## Merksatz

> **Adapter** = Der **Uebersetzer** zwischen zwei verschiedenen Schnittstellen.
>
> Wie ein **Reiseadapter** fuer elektrische Geraete: Der Stecker passt nicht in die Steckdose, der Adapter macht es moeglich.

## Zusammenfassung

Das **Adapter-Muster** ist ein Strukturmuster, das es ermoeglicht, Klassen mit **inkompatiblen Schnittstellen** zusammenzubringen. Es ist besonders nuetzlich beim Arbeiten mit **externen Bibliotheken** oder **Altlasten-Code**, den man nicht ändern kann.