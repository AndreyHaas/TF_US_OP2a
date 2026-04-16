package tag04.unterricht.code_XML_JSON;

// Wir möchten eine externe Bibliothek verwenden, aber sie arbeitet mit einem anderen Datenformat als dem, welches wir bereitstellen können.
// Damit unser Programm nun aber mit der externen Bibliothek kommunizieren kann, müssen wir einen Adapter implementieren, der die Daten entsprechend konvertiert.
// Oder andersherum: Die externe Bibliothek liefert uns Daten, mit denen wir nicht direkt arbeiten können. Also schalten wir einen Adapter dazwischen, der die Daten für uns übersetzt.
// Beispiel: Unsere App kann nur mit XML-Daten umgehen, die externe Bibliothek möchte aber JSON.

import tag04.unterricht.code_XML_JSON.externe_bibliothek.JsonRoutenBerechnung;
import tag04.unterricht.code_XML_JSON.externe_bibliothek.XmlDatei;

public class EntwurfsmusterAdapter {

  public static void main(String[] args) {
    // Wir referenzieren das ClientInterface. Die Referenz zeigt aber auf einen konkreten Adapter.
    // Durch die Kommunikation über das Interface können wir einfach weitere Adapterklassen hinzufügen, wenn wir die App um weitere Bibliotheken erweitern wollen.
    // Der Adapter umhüllt die externe Bibliothek (Wrapper).
    ClientInterface routenberechnung = new XmlJsonAdapter(new JsonRoutenBerechnung());

    // Unser Programm stellt XML-Daten zur Verfügung, zum Beispiel über eine gelesene Datei oder eine Internet-Quelle.
    XmlDatei xmlDaten = new XmlDatei();
    xmlDaten.daten = "Fahrzeugdaten: Standort Oldenburg...";

    XmlDatei ergebnisXml = routenberechnung.getFahrzeitXml(xmlDaten);

    // Ausgabe zur Überprüfung:
    System.out.println("Die Fahrzeit liegt nun in XML vor: " + ergebnisXml.daten);
  }
}