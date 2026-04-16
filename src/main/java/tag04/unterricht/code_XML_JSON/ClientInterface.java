package template;

import template.externe_bibliothek.XmlDatei;

// Das Client-Interface ist die Schnittstelle zwischen dem Client und der externen Bibliothek. Der Client kommuniziert mit der externen Bibliothek über den Adapter, welcher das Interface implementieren muss.
public interface ClientInterface
{
    public abstract XmlDatei getFahrzeitXml(XmlDatei xmlDaten);
}
