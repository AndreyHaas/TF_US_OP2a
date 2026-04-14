package tag02;

public class Fan implements Beobachter {

  private String name;
  private String telefonnummer;

  public Fan(String name, String telefonnummer) {
    this.name = name;
    this.telefonnummer = telefonnummer;
  }

  @Override
  public void update(String text) {
    System.out.println("\n*** WhatsApp Server wird aufgerufen ***");
    System.out.println("Sende eine Nachricht an " + telefonnummer);
    System.out.println("Hallo " + name + ", hier die neusten Infos zum Spiel: " + text + "\n");
  }
}
