package tag09.personService;

import java.util.List;

public interface Service {

  /**
   * Sucht alle Personen mit dem angegebenen Namen.
   *
   * @param name der Name der gesuchten Person (darf nicht null sein)
   * @return eine Liste aller Personen, deren Name mit dem angegebenen Namen übereinstimmt; falls
   * keine Person gefunden wird, wird eine leere Liste zurückgegeben
   */
  List<Person> findPersonByName(String name);
}
