package tag04.unterricht.code_XML_JSON;


import tag04.unterricht.code_XML_JSON.externe_bibliothek.JsonDatei;
import tag04.unterricht.code_XML_JSON.externe_bibliothek.JsonRoutenBerechnung;
import tag04.unterricht.code_XML_JSON.externe_bibliothek.XmlDatei;


// Unsere Client-Anwendung kann nur mit XML-Daten umgehen, aber wir möchten eine externe Bibliothek verwenden, die JSON-Daten erwartet und zurückgibt.
// Unsere Adapter-Klasse löst das Problem, indem die erhaltenen XML-Daten in das JSON-Format umgewandelt werden und das Ergebnis wieder von JSON zurück zu XML.
public class XmlJsonAdapter implements ClientInterface {

  // Damit der Adapter mit der externen Bibliothek kommunizieren kann, speichern wir uns eine Referenz auf diese.
  private final JsonRoutenBerechnung jsonRoutenBerechnung;

  public XmlJsonAdapter(JsonRoutenBerechnung jsonRoutenBerechnung) {
    this.jsonRoutenBerechnung = jsonRoutenBerechnung;
  }

  @Override
  public XmlDatei getFahrzeitXml(XmlDatei xmlDaten) {
    // Die übergebenen XML-Daten müssen in JSON umgewandelt werden.
    JsonDatei jsonDaten = transformiereXmlZuJson(xmlDaten);
    // Die JSON-Daten übergeben wir an die externe Bibliothek.
    JsonDatei ergebnisJson = jsonRoutenBerechnung.berechneFahrzeit(jsonDaten);

    // Das Ergebnis müssen wir wieder in XML-Daten umwandeln und zurückgeben.
    XmlDatei ergebnisXml = transformiereJsonZuXml(ergebnisJson);
    return ergebnisXml;
  }

  // Übersetze den Inhalt der XmlDatei zu JSON und gib die neu erstellte JsonDatei mit dem übersetzten Inhalt zurück.
  private JsonDatei transformiereXmlZuJson(XmlDatei xmlDaten) {
    System.out.println("Habe XML-Daten empfangen. Beginne die Transformation zu JSON...");
    JsonDatei jsonDaten = new JsonDatei();
    jsonDaten.daten = xmlDaten.daten;
    return jsonDaten;
  }

  // Übersetze den Inhalt der JsonDatei zu XML und gib die neu erstellte XmlDatei mit dem übersetzten Inhalt zurück.
  private XmlDatei transformiereJsonZuXml(JsonDatei jsonDaten) {
    System.out.println("Habe JSON-Daten empfangen. Beginne die Transformation zu XML...");
    XmlDatei xmlDaten = new XmlDatei();
    xmlDaten.daten = jsonDaten.daten;
    return xmlDaten;
  }
}
