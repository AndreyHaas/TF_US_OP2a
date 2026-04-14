package tag02.hausAufgaben.a2;

import java.util.ArrayList;
import java.util.List;

public class Einkaufzentrum {

  private List<KundeGruessend> kundeListe = new ArrayList<>();

  public void addGruesser(KundeGruessend gruesser) {
    kundeListe.add(gruesser);
    System.out.println("Abonniert: " + gruesser.getClass().getSimpleName());
  }

  public void removeGruesser(KundeGruessend kunde) {
    kundeListe.remove(kunde);
    System.out.println("Gekuendigt: " + kunde.getClass().getSimpleName());
  }

  public void neuerKundeBetrittDasGebaeude() {
    System.out.println("\n[Sensor] Neuer Kunde betritt das Gebaeude!");
    System.out.println("-------------------");

    for (KundeGruessend gruesser : kundeListe) {
      gruesser.gruessen();
    }

    System.out.println("-------------------\n");
  }
}
