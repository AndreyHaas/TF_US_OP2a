package tag04.unterricht.code_XML_JSON;


import tag04.unterricht.code_XML_JSON.externe_bibliothek.XmlDatei;

// Das Client-Interface ist die Schnittstelle zwischen dem Client und der externen Bibliothek.
// Der Client kommuniziert mit der externen Bibliothek über den Adapter, welcher das Interface implementieren muss.
public interface ClientInterface {

  XmlDatei getFahrzeitXml(XmlDatei xmlDaten);
}
