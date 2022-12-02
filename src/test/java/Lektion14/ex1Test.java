package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ex1Test {

    @Test
    public void testBerechneKugelvolumen() {
        assertEquals(((double)4/3*Math.PI*0*0*0), ex1.berechneKugelvolumen(0));
        assertEquals(((double)4/3*Math.PI*1*1*1), ex1.berechneKugelvolumen(1));
        assertEquals(((double)4/3*Math.PI*5*5*5), ex1.berechneKugelvolumen(5));
        assertEquals(((double)4/3*Math.PI*-1*-1*-1), ex1.berechneKugelvolumen(-1));

    }

}
