package Lektion17;

import Lektion17.ex2.Wertebereich;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class WertebereichTest {

    private Wertebereich wertebereich;

    byte[] b = {1, 2, 5, 6, 2, 3, 3, 9, 8, 7};

    @Before
    public void setUp() throws Exception {
        wertebereich = new Wertebereich(new ByteArrayOutputStream());
    }

    @Test
    public void testWriteNullArray() {
        try {
            wertebereich.write(b, 0, 0);
            fail("Expected NullPointerException not thrown");
        } catch (NullPointerException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testWriteNegativeOff() {
        try {
            wertebereich.write(b, -1, 0);
            fail("Expected IndexOutOfBoundsException not thrown");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testWriteNegativeLen() {
        try {
            wertebereich.write(b, 0, -1);
            fail("Expected IndexOutOfBoundsException not thrown");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testWriteOffPlusLenGreaterThanArrayLength() {
        try {
            wertebereich.write(b, 5, 6);
            fail("Expected IndexOutOfBoundsException not thrown");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }
}
