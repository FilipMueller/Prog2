package Lektion18;

import Lektion18.ex3.ToUpperCaseWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static org.junit.jupiter.api.Assertions.*;


public class ToUpperCaseWriterTest {
    ToUpperCaseWriter writer;
    ByteArrayOutputStream baos;

    @BeforeEach
    public void prepareTest()
    {
        baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        writer = new ToUpperCaseWriter(osw);
    }

    @AfterEach
    public void cleanUp()
    {
        try
        {
            writer.close();
        }
        catch (IOException e)
        {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void writeCharTest() {
        try {
            testMethode(writer, 'a', baos, "A");
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void writeCharTestWithNonChar() {
        try {
            testMethode(writer, '1', baos, "1");
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void writeASCIIWithAtoZ() {
        try {
            for (int i = 0; i < 128; i++) {
                int assertNumber = i + 22;
                String aN = Integer.toString(assertNumber);
                char ascii = (char) i;
                String asciiToString =  Character.toString(ascii);
                if (i >= 97 && i <= 122) {
                    testMethode(writer, ascii, baos, aN);
                } else {
                    System.out.println(" TEST ");
//                    testMethode(writer, ascii, baos, asciiToString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void testMethode(ToUpperCaseWriter writer, char a, ByteArrayOutputStream baos, String a2) throws IOException {
        writer.write(a);
        writer.flush();
        String uppercase = baos.toString();
        assertEquals(a2, uppercase);
    }
}
