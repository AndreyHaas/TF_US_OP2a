# Grundlagen des Software-Testens (Software Testing Basics)

## 1. Was ist Software-Testing?

**Software-Testing** ist der Prozess der Bewertung eines Softwareprodukts, um Unterschiede zwischen dem tatsächlichen und dem geforderten Zustand zu erkennen (Auffinden von Fehlern) und die Qualität des Produkts zu beurteilen.

> **Schlüsselzitat (laut ANSI/IEEE 829):** Testing ist der Prozess der Analyse von Software, um Unterschiede zwischen bestehenden und geforderten Bedingungen (Fehlern) zu erkennen und die Eigenschaften der Software zu bewerten.

## 2. Warum ist Testing wichtig? (Ziele)

- **Fehler entdecken (Bugs)** – das Hauptziel.
- **Fehler vermeiden** (durch Analyse der Anforderungen vor der Entwicklung).
- **Qualität bewerten** (wie fertig ist das Produkt für die Veröffentlichung?).
- **Vertrauen** in die Funktionalität des Produkts schaffen.
- **Risiken reduzieren** und die Kosten für Fehlerbehebungen senken (günstiger, wenn früher behoben).

## 3. Teststufen (Testing Levels)

Das Testing verläuft parallel zur Entwicklung und besteht aus 4 Hauptstufen:

| Stufe | Was wird geprüft? | Wer macht es meistens? |
| :--- | :--- | :--- |
| **Modultest (Unit)** | Einzelne Funktionen / Methoden / Klassen | Entwickler |
| **Integrationstest** | Zusammenspiel zwischen Modulen | Entwickler / Tester |
| **Systemtest** | Das gesamte System (Ende-zu-Ende) | Tester |
| **Abnahmetest (Acceptance)** | Übereinstimmung mit den Geschäftsanforderungen | Kunde / QA |

## 4. Testarten (Testtypen)

### Nach Wissen über das System:
- **Black Box:** Keine Kenntnis des inneren Aufbaus, nur Eingaben und Ausgaben werden geprüft.
- **White Box:** Kenntnis des Codes, Logik und Ausführungspfade werden geprüft.
- **Grey Box:** Kombination (z. B. Kenntnis der Datenbankstruktur, aber nicht des gesamten Codes).

### Nach Ausführungszeitpunkt:
- **Smoke Testing:** Kurze Prüfung der kritischen Funktionen („Build-Verifizierung“).
- **Sanity Testing:** Prüfung, ob Fehlerbehebungen die bestehende Logik nicht zerstört haben.
- **Regressionstest:** Wiederholtes Prüfen alter Funktionen nach Änderungen (die häufigste Testart).
- **Retest:** Prüfung eines konkreten behobenen Fehlers.

### Nach Qualitätsmerkmal:
- **Funktionales Testing:** Arbeitet das System wie in den Anforderungen beschrieben?
- **Lasttest (Performance):** Geschwindigkeit, Antwortzeiten.
- **Stabilitätstest (Reliability):** Stürzt das System unter Last ab?
- **Usability-Testing:** Ist das System benutzerfreundlich?

## 5. Lebenszyklus eines Fehlers (Bug Life Cycle)

1.  **New** (gefunden) → 2. **Assigned** (einem Entwickler zugewiesen)
3.  **Open** (zur Bearbeitung angenommen) → 4. **Fixed** (behoben)
5.  **Retest** (Nachprüfung durch den Tester)
    - *Wenn behoben:* → **Closed**
    - *Wenn nicht behoben:* → **Reopened** (zurück zum Entwickler)

**Weitere mögliche Status:** *Rejected* (abgelehnt – kein Fehler), *Deferred* (zurückgestellt), *Duplicate* (Doppelter Fehlerbericht).

## 6. Testdokumentation (Wichtige Artefakte)

1.  **Testplan:** Was, wann, wer und wie wird getestet.
2.  **Testfall (Test Case):** Schritt-für-Schritt-Anleitung zum Prüfen einer konkreten Funktion.
    *Bestandteile:* ID, Titel, Vorbedingungen, Schritte, erwartetes Ergebnis, tatsächliches Ergebnis.
3.  **Checkliste (Checklist):** Liste der zu prüfenden Punkte (ohne detaillierte Schritte).
4.  **Fehlerbericht (Bug Report):** Meldung eines Defekts.

## 7. Beispiel für die Struktur eines Fehlerberichts

```
Titel: [Kurze Beschreibung des Problems]
Priorität: (Hoch / Mittel / Niedrig)
Schweregrad: (Blocker / Critical / Major / Minor / Trivial)
Umgebung: (Betriebssystem, Browser, App-Version)
Schritte zur Reproduktion:
1. Login-Seite öffnen
2. Leeres Passwort eingeben
   Erwartetes Ergebnis: Meldung "Passwort darf nicht leer sein"
   Tatsächliches Ergebnis: Server-Fehler 500
   Anhänge: (Screenshot, Video, Log-Auszug)
```

## 8. Testprinzipien (7 wichtige Prinzipien)

1.  **Vollständiges Testing ist unmöglich.** (Man kann NICHT alles prüfen).
2.  **Fehler clustern sich.** (80 % der Bugs stecken in 20 % der Module).
3.  **Testing zeigt die Anwesenheit von Fehlern, nicht deren Abwesenheit.**
4.  **Pestizid-Paradoxon:** Werden immer dieselben Tests ausgeführt, finden sie keine neuen Fehler mehr.
5.  **Frühes Testen** (so früh wie möglich mit dem Testen beginnen).
6.  **Kontextabhängigkeit** (Bankensoftware vs. Computerspiel erfordern unterschiedliche Ansätze).
7.  **Trugschluss der Fehlerfreiheit:** Ein System mit 0 Bugs kann für den Benutzer trotzdem nutzlos sein.

## 9. Rollen im Team (Kurzübersicht)

- **QA Engineer (Qualitätsingenieur):** Verantwortlich für Qualitätsprozesse (Fehlervermeidung).
- **QC Engineer (Tester):** Findet direkt Fehler.
- **Testanalyst:** Analysiert Anforderungen und schreibt Testfälle.
- **Automation Engineer:** Schreibt automatisierte Tests.

## 10. Fazit

Testing ist **nicht einfach nur „Knöpfe drücken“**. Es ist eine Disziplin, die analytisches Denken, Liebe zum Detail und Verständnis für systemische Zusammenhänge erfordert. Heute haben wir das Fundament gelegt.

> **Denken Sie daran:** Ein guter Tester ist nicht derjenige, der viele Fehler gefunden hat, sondern derjenige, der dem Team geholfen hat, ein qualitativ hochwertiges Produkt in kürzester Zeit zu liefern.