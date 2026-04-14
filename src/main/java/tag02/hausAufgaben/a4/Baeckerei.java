package tag02.hausAufgaben.a4;

/**
 * Klasse Baeckerei - implementiert IObserver (Empfaenger des Events)
 * - Backt Kuchen bei Geburtstag (Konsolenausgabe)
 */
class Baeckerei implements IObserver {
  private String name;

  public Baeckerei(String name) {
    this.name = name;
  }

  @Override
  public void update(String kundeName, String geschmacksrichtung) {
    backeKuchen(kundeName, geschmacksrichtung);
  }

  private void backeKuchen(String kundeName, String geschmacksrichtung) {
    System.out.println("🧁 " + name + ": Ich backe einen " + geschmacksrichtung + "-Kuchen fuer " + kundeName + "! 🧁");
  }

  public String getName() {
    return name;
  }
}