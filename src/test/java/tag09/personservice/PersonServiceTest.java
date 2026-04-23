package tag09.personservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
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
        new Person("Max", 19)
    );

    service = new PersonService(personen);
  }

  @Test
  void testFindPersonByName() {
    List<Person> result = service.findPersonByName("Max");
    assertEquals(3, result.size());

    for (Person person : result) {
      assertEquals("Max", person.name());
      System.out.println(person);
    }
  }
}