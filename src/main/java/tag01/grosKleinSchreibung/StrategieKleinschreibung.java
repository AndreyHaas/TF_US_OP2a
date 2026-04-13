package GroßKleinSchreibung;

public class StrategieKleinschreibung implements Strategie
{
    // 2.Erstelle konkrete Klassen, die das Interface implementieren.
    // Für jede konkrete GroßKleinSchreibung.Strategie eine Klasse.

    @Override
    public String erstelleZeichenkette(String a, String b)
    {
        return a.toLowerCase() + b.toLowerCase();
    }

}
