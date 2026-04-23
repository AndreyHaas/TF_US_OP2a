package tag09.aufgabe.aufgabe2.lsg;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private final List<Buch> buecher;

    public Bibliothek() 
    {
        buecher = new ArrayList<>();
    }

    public void fuegeBuchHinzu(Buch buch) {
        buecher.add(buch);
    }

    public boolean entferneBuch(String isbn) {
        for (int i = 0; i < buecher.size(); i++) {
            if (buecher.get(i).getIsbn().equals(isbn)) {
                buecher.remove(i);
                return true;
            }
        }
        return false;
    }

    public Buch findeBuchNachTitel(String titel) {
        for (Buch buch : buecher) {
            if (buch.getTitel().equalsIgnoreCase(titel)) {
                return buch;
            }
        }
        return null;
    }

    public List<Buch> alleBuecherAuflisten() {
        return new ArrayList<>(buecher);
    }

}
