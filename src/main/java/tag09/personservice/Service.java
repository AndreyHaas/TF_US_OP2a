package tag09.personservice;

import java.util.List;

public interface Service {

  /**
   * Findet alle Personen anhand ihres Namens unter Ignorierung der Groß-/Kleinschreibung.
   * <p>
   * Die Methode durchsucht die interne Liste aller Personen und gibt jede Person zurück, deren Name
   * mit dem angegebenen Suchnamen übereinstimmt. Dabei wird nicht zwischen Groß- und
   * Kleinschreibung unterschieden.
   * </p>
   *
   * @param name der Name der gesuchten Person (Groß-/Kleinschreibung wird ignoriert)
   * @return eine {@link List} von {@link Person}-Objekten mit dem gesuchten Namen; wenn keine
   * Person gefunden wird, wird eine leere Liste zurückgegeben (niemals null)
   * @throws NullPointerException wenn der übergebene Name null ist
   */
  List<Person> findPersonByName(String name);
}
