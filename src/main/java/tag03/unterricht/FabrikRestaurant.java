package tag03.unterricht;

/* 3. Wir implementieren eine Fabrikklasse mit (min) einer Fabrikmethode, die neue Produkte erzeugt.
        Der Rückgabetyp der Fabrikmethode sollte dem Produktinterface entsprechen.
     4. Wir können die Fabrikmethode oder die ganze Fabrikklasse abstrakt machen und so alle ableitende Fabrikklassen
        zwingen ihre eigene Version der Methode zu implementieren.
     5. Die Basisfabrikklasse hält häufig gemeinsame Basislogik für Produkte bereit, aber die eigentliche Produkterzeugung
        geschieht in den konkreten Fabrikklassen.*/

public abstract class FabrikRestaurant {
    // Abstrakte Klassen in Java dienen als Blaupause für andere Klassen und können
    // NICHT direkt instanziiert werden
    // abstrakte Klassen können Attribute haben und Interface nicht

    //3. Fabrikmethode erzeugt mit Rückgabewert des Produktinterface
    //4. Fabrikmethode abstract gemacht (Kann man machen)
    public abstract ProduktGericht erzeugeGericht();

    //5. gemeinsame Logik für alle Produkte ausgeben lassen
    public abstract String bestellungsInfo();
}