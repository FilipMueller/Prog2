package Lektion15;

import static org.junit.jupiter.api.Assertions.*;
import Lektion15.ex1.Abteilungsleiter;
import Lektion15.ex1.Angestellter;
import org.junit.jupiter.api.Test;

public class AbteilungTest {

    Angestellter Peter = new Angestellter("Peter", "Müller", 1234, 2500, 1, "17.07.1982");
    Angestellter Gerd = new Angestellter("Gerd", "Hansen", 5123, 2500, 1, "09.12.1986");
    Abteilungsleiter Hans = new Abteilungsleiter("Hans", "Bauer", 2133, 2500, 2, "22.05.1976");

    @Test
    public void angestellterTest() {
        assertEquals(2500, Gerd.getGrundGehalt());
        assertEquals(1, Peter.getGehaltsFaktor());
        assertEquals(5000, Hans.getGehaltsFaktor() * Hans.getGrundGehalt());
    }

    @Test
    public void befoerdernTest() {
        Hans.befoerdern(Gerd);
        assertEquals(2500 * 1.10, Gerd.getGehaltsFaktor() * Gerd.getGrundGehalt());
    }
}
