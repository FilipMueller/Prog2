package Lektion14;

import static org.junit.jupiter.api.Assertions.*;

import Lektion14.ex2.ex2;
import org.junit.jupiter.api.Test;

public class ex2Test {

    @Test
    public void testVerschiebePunktFails() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ex2.verschiebePunkt(4, -1);});
        Exception exception2 = assertThrows(RuntimeException.class, () -> {
            ex2.verschiebePunkt( 2000, -1);});
        Exception exception3 = assertThrows(RuntimeException.class, () -> {
            ex2.verschiebePunkt(4, 2000);});
    }

    @Test
    public void testVerschiebePunktWorks() {
        assertDoesNotThrow(() -> {ex2.verschiebePunkt(4, 2);});
    }
}
