package Lektion17;

import java.io.*;
import java.util.Objects;

public class ex2 {

    OutputStream m;

    public ex2(OutputStream m) {
        this.m = m;
    }

    public void write(byte[] b, int off, int len) throws IOException {

        if (b == null) {
            throw new IOException("Byte-Array leer");
        }

        try {
            if (off < 0) {
                throw new IOException("Ungültger Offset");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (len <= 0 || len > b.length) {
                throw new IOException("Ungültige Länge");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*if (b == null) {
            throw new IOException("Byte-Array leer");
        }
        if (off < 0) {
            throw new IOException("Ungültger Offset");
        }
        if (len <= 0 || len > b.length) {
            throw new IOException("Ungültige Länge");
        } else {
            m.write(b,off,len);
        }*/
    }


}
