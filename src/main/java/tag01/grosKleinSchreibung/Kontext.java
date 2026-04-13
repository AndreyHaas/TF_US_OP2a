package GroßKleinSchreibung;

public class Kontext
{
    // 3. Erstelle eine Kontextklasse.
    // Die Kontextklasse muss ein Attribut bereithalten, um eine Referenz zu einer
    // GroßKleinSchreibung.Strategie abspeichern zu können.

    //Attribut von dem Interface GroßKleinSchreibung.Strategie
    private Strategie stra;

    // 4. Die Kontextklasse funktioniert mit allen Strategien durch dasselbe
    // Interface, welches nur eine Methode bereitstellt, um die gewählte GroßKleinSchreibung.Strategie
    // auszuführen. Durch das Strategiemuster wird die Kontextklasse unabhängig von
    // konkreten Strategien.

    // 5. Das GroßKleinSchreibung.Strategie-Muster unterstützt das Open/Closed Prinzip d.h. der
    // Entwickler kann beliebig neue Algorithmen / Strategien hinzufügen, ändern oder
    // erweitern, ohne die Kontextklasse oder bestehende Strategieklassen anpassen zu
    // müssen.

    // Setter-Methode um GroßKleinSchreibung.Strategie zu setzen
    public void setStrategie(Strategie stra)
    {
        this.stra = stra; //wenn der Übergabeparameter exa
    }

    // Methode um GroßKleinSchreibung.Strategie auszuführen
    public String führeStrategieAus(String s1, String s2)
    {
        return stra.erstelleZeichenkette(s1, s2);
    }









}
