package tag09.personservice;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements Service {

  private final List<Person> people;

  public PersonService(List<Person> people) {
    this.people = people;
  }

  @Override
  public List<Person> findPersonByName(String name) {
    List<Person> result = new ArrayList<>();

    for (Person person : people) {
      if (person.name().equals(name)) {
        result.add(person);
      }
    }

    return result;
  }
}