package Lektion15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AbteilungTest {

    Angestellter Peter = new Angestellter("Peter", "Müller", 1234, 2500, 1, "17.07.1982");
    Angestellter Gerd = new Angestellter("Gerd", "Hansen", 5123, 2500, 1, "09.12.1986");
    Abteilungsleiter Hans = new Abteilungsleiter("Hans", "Bauer", 2133, 2500, 2, "22.05.1976");

    @Test
    public void angestellterTest() {
        assertEquals(2500, Gerd.grundGehalt);
        assertEquals(2, Hans.gehaltsFaktor);
        assertEquals(5000, Hans.gehaltsFaktor * Hans.grundGehalt);
    }

    @Test
    public void befoerdernTest() {
        Hans.befoerdern(Gerd);
        assertEquals(2500 * 1.10, Gerd.gehaltsFaktor * Gerd.grundGehalt);

    }
}
