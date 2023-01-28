package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import Lektion14.ex4.Strecke;
import org.junit.jupiter.api.Test;

public class StreckeTest {

    Strecke streckeX = new Strecke(4, 6);
    Strecke streckeY = new Strecke( 5,2);
    Strecke streckeZ = new Strecke(9, 18);
    Strecke streckeK = new Strecke(5, 5);

    @Test
    public void aUndBTest() {
        assertEquals(4,streckeX.getStartPoint());
        assertEquals(2,streckeY.getStartPoint());
    }

    @Test
    public void ueberschneidenTest() {
        assertFalse(streckeX.ueberschneiden(streckeZ));
        assertFalse(streckeY.ueberschneiden(streckeK));
        assertTrue(streckeX.ueberschneiden(streckeY));
    }

    @Test
    public void ausgabeTest() {
        System.out.println(streckeX.toString());
        System.out.println(streckeY.toString());
        System.out.println(streckeZ.toString());
        System.out.println(streckeK.toString());
    }
}
