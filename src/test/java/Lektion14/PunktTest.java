package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import Lektion14.ex2.Punkt;
import org.junit.jupiter.api.Test;

public class PunktTest {

    @Test
    public void testVerschiebePunktFails() {
        assertThrows(RuntimeException.class, () -> {
            Punkt.verschiebePunkt(4, -2);
        });
        assertThrows(RuntimeException.class, () -> {
            Punkt.verschiebePunkt(2000, -1);
        });
        assertThrows(RuntimeException.class, () -> {
            Punkt.verschiebePunkt(4, 2000);
        });
        assertThrows(RuntimeException.class, () -> {
            Punkt.verschiebePunkt(-2, 288);
        });
    }

    @Test
    public void testVerschiebePunktWorks() {
        assertDoesNotThrow(() -> {
            Punkt.verschiebePunkt(4, 2);
        });
    }
}
