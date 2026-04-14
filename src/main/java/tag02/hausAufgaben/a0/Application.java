package tag02.hausAufgaben.a0;

public class Application {

  public static void main(String[] args) {

    Person person = new Person();

    person.addFeuerloescher(new Feuerwehr());
    person.feuerRufen();
  }
}