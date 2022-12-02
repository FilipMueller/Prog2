package Lektion15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UniTest {

    @Test
    public void testTest() {
        Person2 prof = new Professor("Betriebssysteme");
        Person2 student = new Professor("Betriebssysteme");

        assertEquals("Betriebssysteme", prof.fach);
        assertEquals("Betriebssysteme", student.fach);
    }

}
