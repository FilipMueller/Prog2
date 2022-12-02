package Lektion17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2Test {

    FileOutputStream os = new FileOutputStream("ex2.txt");
    ex2 x = new ex2(os);

    byte[] a = {1, 4, 16, 2, 22, 32};
    byte[] b = {4, 10, 2, 89, 2, 64, 100, 127};
    byte[] c = {};
    byte[] d = {4, 8, 2, 19};


    public ex2Test() throws FileNotFoundException {
    }

    @Test
    public void writeTest() {
//        Exception exception = assertThrows(IOException.class, x.write(a,1, 5));
    }
}
