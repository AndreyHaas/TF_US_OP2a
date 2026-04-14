package tag02.LösungMitDozent;

public interface Beobachter {
  // Erstelle ein allgemeines Beobachter Interface. In den meisten Fällen besteht dies aus einer einzigen update() Methode.
  // Die Methode kann über verschiedene Parameter verfügen, wodurch es dem Publisher ermöglicht wird, Ereignisdetails mitzuliefern.
  // Dadurch ist der Publisher nicht mit konkreten Klassen verkuppelt, sondern kennt nur den abstrakten Typ.

  void update(String text);
}