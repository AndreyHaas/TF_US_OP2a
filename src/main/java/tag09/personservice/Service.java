package tag09.personservice;

import java.util.List;

public interface Service {

  /**
   * Findet alle Personen anhand ihres Namens.
   * <p>
   * Die Methode durchsucht die interne Liste aller Personen und gibt jede Person zur&uuml;ck,
   * deren Name exakt mit dem angegebenen Suchnamen &uuml;bereinstimmt.
   * </p>
   *
   * @param name der Name der gesuchten Person (Gro&szlig;-/Kleinschreibung wird beachtet)
   * @return eine {@link List} von {@link Person}-Objekten mit dem gesuchten Namen;
   *         wenn keine Person gefunden wird, wird eine leere Liste zur&uuml;ckgegeben
   *         (niemals null)
   *
   * @throws NullPointerException wenn der &uuml;bergebene Name null ist
   */
  List<Person> findPersonByName(String name);
}
