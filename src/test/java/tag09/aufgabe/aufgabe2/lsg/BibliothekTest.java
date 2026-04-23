package tag09.aufgabe.aufgabe2.lsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliothekTest {
    private Bibliothek bibliothek;
    Buch buch1;
    Buch buch2;

    @BeforeEach
    void setUp() {
        bibliothek = new Bibliothek();
        buch1 = new Buch("Effektives Java", "Joshua Bloch", "1234567890");
        buch2 = new Buch("Sauberer Code", "Robert C. Martin", "0987654321");

        bibliothek.fuegeBuchHinzu(buch1);
        bibliothek.fuegeBuchHinzu(buch2);
    }

    @Test
    public void testFuegeBuchHinzu() {
        Buch buch3 = new Buch("Entwurfsmuster", "Erich Gamma", "1122334455");
        bibliothek.fuegeBuchHinzu(buch3);
        assertEquals(3, bibliothek.alleBuecherAuflisten().size(),
                "Es sollten 3 Bücher in der Bibliothek sein");
    }

    @Test
    public void testEntferneBuch() {
        assertTrue(bibliothek.entferneBuch("1234567890"), "Das Buch sollte entfernt werden");
        assertEquals(1, bibliothek.alleBuecherAuflisten().size(),
                "Es sollte nur 1 Buch in der Bibliothek sein");
    }

    @Test
    public void testFindeBuchNachTitel() {
        Buch buch = bibliothek.findeBuchNachTitel("Sauberer Code");
        assertNotNull(buch, "Das Buch sollte gefunden werden");
        assertEquals(buch2, buch, "Das gefundene Buch sollte 'Sauberer Code' sein");
    }

    @Test
    public void testFindeBuchNachTitelNichtGefunden() {
        Buch buch = bibliothek.findeBuchNachTitel("Unbekannter Titel");
        assertNull(buch, "Es sollte kein Buch gefunden werden");
    }

    @Test
    public void testAlleBuecherAuflisten() {
        List<Buch> buecher = bibliothek.alleBuecherAuflisten();
        assertEquals(2, buecher.size(), "Es sollten 2 Bücher in der Bibliothek sein");
        assertTrue(buecher.contains(buch1),
                "Die Bibliothek sollte 'Effektives Java' enthalten");
        assertTrue(buecher.contains(buch2),
                "Die Bibliothek sollte 'Sauberer Code' enthalten");
    }
}