package tag09.personservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

  private Service service;

  @BeforeEach
  void setup() {
    List<Person> personen = Arrays.asList(
        new Person("Max", 30),
        new Person("Anna", 25),
        new Person("Max", 35),
        new Person(null, 42),
        new Person("MaX", 19),
        null
    );

    service = new PersonService(personen);
  }

  @Test
  void testFindPersonByName() {
    List<Person> result = service.findPersonByName("max");
    assertEquals(3, result.size());

    for (Person person : result) {
      assertNameEqualsMax(person);
    }
  }

  /**
   * Vergleicht den Namen einer Person mit "max" (Groß-/Kleinschreibung wird ignoriert).
   * <p>
   * Ist die Person oder ihr Name null, wird der Vergleich stillschweigend übersprungen (kein
   * Assertion-Fehler).
   * </p>
   *
   * @param person die zu prüfende Person (darf null sein)
   */
  private static void assertNameEqualsMax(Person person) {
    Optional.ofNullable(person)
        .map(Person::name)
        .map(String::toLowerCase)
        .ifPresent(name -> assertEquals("max", name,
            "Der Name sollte 'max' sein (Groß-/Kleinschreibung wird ignoriert). "
                + "Aktueller Name: '" + name + "'"));
  }
}