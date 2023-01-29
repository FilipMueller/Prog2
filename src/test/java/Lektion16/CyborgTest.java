package Lektion16;

import static org.junit.jupiter.api.Assertions.*;
import Lektion16.ex4.*;
import org.junit.jupiter.api.Test;

public class CyborgTest {

    Mensch m = new Mensch();
    Roboter r = new Roboter();
    Cyborg c = new Cyborg(m, r);

    @Test
    public void testMensch() {
        assertEquals(m.entscheide(Gefahren.GEFAHR_LINKS), Entscheidung.RECHTS);
        assertEquals(m.entscheide(Gefahren.GEFAHR_RECHTS), Entscheidung.LINKS);
        assertEquals(m.entscheide(Gefahren.GEFAHR_VORNE), Entscheidung.BREMSEN);
    }

    @Test
    public void testRoboter() {
        assertEquals(r.entscheide(Gefahren.GEFAHR_LINKS), Entscheidung.RECHTS);
        assertEquals(r.entscheide(Gefahren.GEFAHR_RECHTS), Entscheidung.LINKS);
        assertEquals(r.entscheide(Gefahren.GEFAHR_VORNE), Entscheidung.BREMSEN);
    }

    @Test
    public void testCyborg() {
        Entscheidung mensch = c.getMensch().entscheide(Gefahren.GEFAHR_LINKS);
        Entscheidung roboter = c.getRoboter().entscheide(Gefahren.GEFAHR_LINKS);
        if (mensch == roboter) {
            assertEquals(c.entscheide(Gefahren.GEFAHR_LINKS), mensch);
        } else {
            assertTrue(c.entscheide(Gefahren.GEFAHR_LINKS) == mensch || c.entscheide(Gefahren.GEFAHR_LINKS) == roboter);
        }
    }
}
