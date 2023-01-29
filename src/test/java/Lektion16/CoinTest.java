package Lektion16;

import static org.junit.jupiter.api.Assertions.*;
import Lektion16.ex2.SimpleChangeCalculator;
import org.junit.jupiter.api.Test;

public class CoinTest {

    @Test
    public void rueckgabeTest() {
        SimpleChangeCalculator scc = new SimpleChangeCalculator();
        int[] t1 = {1, 0, 1, 1, 0, 1, 1, 2};
        int[] t2 = {0, 2, 0, 0, 2, 0, 1, 0};
        int[] t3 = {0, 2, 1, 0, 2, 1, 1, 4};
        int[] t4 = {0, 1, 1, 0, 1, 0, 0, 0};

        assertArrayEquals(t1,scc.getChange(5,66));
        assertArrayEquals(t2,scc.getChange(1,44));
        assertArrayEquals(t3,scc.getChange(9,99));
        assertArrayEquals(t4,scc.getChange(0,27));
    }
}
