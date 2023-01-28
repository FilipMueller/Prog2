package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import Lektion14.ex1.Kugelvolumen;
import org.junit.jupiter.api.Test;

public class KugelvolumenTest {

    @Test
    public void testBerechneKugelvolumen() {
        assertEquals(((double)4/3*Math.PI*0*0*0), Kugelvolumen.berechneKugelvolumen(0));
        assertEquals(((double)4/3*Math.PI*1*1*1), Kugelvolumen.berechneKugelvolumen(1));
        assertEquals(((double)4/3*Math.PI*5*5*5), Kugelvolumen.berechneKugelvolumen(5));
        assertEquals(((double)4/3*Math.PI*-1*-1*-1), Kugelvolumen.berechneKugelvolumen(-1));
    }
}
