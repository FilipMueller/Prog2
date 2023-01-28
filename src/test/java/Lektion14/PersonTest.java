package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import Lektion14.ex3.Adresse;
import Lektion14.ex3.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testPersonVornameFails() {
        assertThrows(RuntimeException.class, () -> {
            new Person("peter", new Adresse("Strasse4", "Schweinfurt", "42a"));
        });
    }

    @Test
    public void testPersonStrasseFails() {
        assertThrows(RuntimeException.class, () -> {
            new Person("Peter", new Adresse("strasse4", "Schweinfurt", "42a"));
        });
    }

    @Test
    public void testPersonOrtFails() {
        assertThrows(RuntimeException.class, () -> {
            new Person("Peter", new Adresse("Strasse4", "schweinfurt", "42a"));
        });
    }

    @Test
    public void testPersonHausnummerFails() {
        assertThrows(RuntimeException.class, () -> {
            new Person("Peter", new Adresse("Strasse4", "Schweinfurt", "b"));
        });
    }

    @Test
    public void testPersonWorks() {
        assertDoesNotThrow(() -> {
            new Person ("Peter", new Adresse("Strasse4", "Schweinfurt", "42a"));
        });
    }
}
