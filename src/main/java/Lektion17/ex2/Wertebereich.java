package Lektion17.ex2;

import java.io.*;

public class Wertebereich {
    OutputStream m;

    public Wertebereich(OutputStream m) {
        this.m = m;
    }

    public void write(byte[] b, int off, int len) throws IOException {
        try {
            if (b == null) {
                throw new NullPointerException();
            }
            if (off < 0 || len < 0 || off + len > b.length) {
                throw new IndexOutOfBoundsException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
