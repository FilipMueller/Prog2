package Lektion16.ex1;

import org.junit.jupiter.api.Test;

public class Schachtest {

    LaeuferImpl l = new LaeuferImpl(8, 5);
    Brett brett = l.gibErlaubteFelder();

    @Test
    public boolean schachTestLaeufer() {
        for (int i = 1; i <= 8; i++) {
            if (brett.gibFeld(l.getX() - i, l.getY() + i) || brett.gibFeld(l.getX() + i, l.getY() + i) || brett.gibFeld(l.getX() - i, l.getY() - i) || brett.gibFeld(l.getX() + i, l.getY() - i)) {
                return true;
            }
        }
        return false;
    }
}
