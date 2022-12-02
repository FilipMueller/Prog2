package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StreckeTest {

    @Test
    public void aUndBTest() {
        Strecke X = new Strecke(4, 6);
        Strecke Y = new Strecke( 5,2);
        assertEquals(4,X.A);
        assertEquals(2,Y.A);
    }

    @Test
    public void ueberschneidenTest() {
        Strecke X = new Strecke(4, 6);
        Strecke Y = new Strecke( 5,2);
        Strecke Z = new Strecke(9, 18);
        Strecke K = new Strecke(5, 5);
        assertFalse(X.ueberschneiden(Z));
        assertFalse(Y.ueberschneiden(K));
        assertTrue(X.ueberschneiden(Y));
    }
}
