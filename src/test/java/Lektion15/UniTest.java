package Lektion15;

import static org.junit.jupiter.api.Assertions.*;
import Lektion15.ex2.Person2;
import Lektion15.ex2.Professor;
import org.junit.jupiter.api.Test;

public class UniTest {

    @Test
    public void testTest() {
        Person2 prof = new Professor("Betriebssysteme");
        Person2 student = new Professor("Betriebssysteme");

        assertEquals("Betriebssysteme", prof.getFach());
        assertEquals("Betriebssysteme", student.getFach());
    }
}
