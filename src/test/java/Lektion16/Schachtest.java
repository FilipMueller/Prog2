package Lektion16;

import static org.junit.jupiter.api.Assertions.*;
import Lektion16.ex1.Brett;
import Lektion16.ex1.LaeuferImpl;
import org.junit.jupiter.api.Test;

public class Schachtest {

    LaeuferImpl laeufer = new LaeuferImpl(8, 5);
    Brett brett = laeufer.gibErlaubteFelder();

    @Test
    public void laeuferTest() {
        for (int i = 1; i <= 8; i++) {
            if (laeufer.getX() - i > 0 && laeufer.getY() + i < 9) {
                assertTrue(brett.gibFeld(laeufer.getX() - i, laeufer.getY() + i));
            }
            if (laeufer.getX() + i < 9 && laeufer.getY() + i < 9) {
                assertTrue(brett.gibFeld(laeufer.getX() + i, laeufer.getY() + i));
            }
            if (laeufer.getX() - i > 0 && laeufer.getY() - i > 0) {
                assertTrue(brett.gibFeld(laeufer.getX() - i, laeufer.getY() - i));
            }
            if (laeufer.getX() + i < 9 && laeufer.getY() - i > 0) {
                assertTrue(brett.gibFeld(laeufer.getX() + i, laeufer.getY() - i));
            }
        }
    }
}
