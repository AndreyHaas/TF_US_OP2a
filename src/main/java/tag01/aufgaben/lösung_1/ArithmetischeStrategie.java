package tag01.aufgaben.lösung_1;

// Das Strategieinterface deklariert alle Methoden, um die gewünschten Algorithmen in den konkreten Strategien umzusetzen.
// Der Kontext benutzt dieses Interface, um die Algorithmen der konkreten Strategien aufzurufen.
interface ArithmetischeStrategie {
    int berechne(int zahl1, int zahl2);
}

//-------------------------------------------------------------------------------------------------------------------------

