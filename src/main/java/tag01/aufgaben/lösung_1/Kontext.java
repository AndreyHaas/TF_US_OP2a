package tag01.aufgaben.lösung_1;

//--------------------------------------------------------------------------------------------------------------------------
class Kontext {
    public Kontext() {
    }

    // Der Kontext hält eine Referenz auf ein Strategieobjekt, er weiß
    // aber nicht welche konkrete Klasse von Strategie. Dies funktioniert
    // mit allen Strategien über das StrategieInterface.
    private ArithmetischeStrategie strategie;

    // Gewöhnlicherweise wird die Strategie über den Konstruktor der Kontextklasse gesetzt.
    public Kontext(ArithmetischeStrategie strategie) {
        this.strategie = strategie;
    }

    // Um zur Laufzeit die Strategie ändern zu können, stellt uns die Kontextklasse einen Setter zur Verfügung.
    public void setStrategie(ArithmetischeStrategie strategie) {
        this.strategie = strategie;
    }

    // Die Kontextklasse lagert Arbeit in die Strategieobjekte aus, anstatt selbst verschiedene Versionen des
    // Algorithmus zu implementieren.
    public int fuehreStrategieAus(int zahl1, int zahl2) {
        return this.strategie.berechne(zahl1, zahl2);
    }
}
