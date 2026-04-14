package tag02;

import java.util.ArrayList;
import java.util.List;

public class Veroeffentlicher {

  private List<Beobachter> beobachterListe;

  public Veroeffentlicher() {
    beobachterListe = new ArrayList<>();
  }

  public void fuegeBeobachterHinzu(Beobachter beobachter) {
    beobachterListe.add(beobachter);
  }

  public void entferneBeobachter(Beobachter beobachter) {
    beobachterListe.remove(beobachter);
  }

  public void benachrichtigeBeobachter(String text) {
    for (Beobachter beobachter : beobachterListe) {
      beobachter.update(text);
    }
  }
}
