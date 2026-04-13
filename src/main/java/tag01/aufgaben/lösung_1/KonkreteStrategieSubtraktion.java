package tag01.aufgaben.lösung_1;

//--------------------------------------------------------------------------------------------------------------------------
//Konkrete Strategien implementieren ihren Algorithmus, indem sie den Vertrag
//des Interface erfüllen. Das Interface macht sie austauschbar in der Kontextklasse.
public class KonkreteStrategieSubtraktion implements ArithmetischeStrategie {

    @Override
    public int berechne(int zahl1, int zahl2) {

        return zahl1 - zahl2;
    }
}
