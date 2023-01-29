package Lektion17.ex4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler {

    OutputStream ops1;
    OutputStream ops2;

    public OutputStreamDoubler(OutputStream ops1, OutputStream ops2) {
        this.ops1 = ops1;
        this.ops2 = ops2;
    }

    public void close() throws IOException {
        try {
            ops1.close();
        }
        catch (IOException e) {
            ops2.close();
            throw new IOException("OutputStream1 Fehler! ");
            //flag anstatt EXception
        }
        try {
            ops2.close();
        }
        catch (IOException e) {
            ops1.close();
            throw new IOException("OutputStream2 Fehler! ");
        }
        //if
    }

    public void write(int b) {
        boolean flag = true;
        try {
            ops1.write(b);
            flag = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ops2.write(b);
            flag = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fOpS1 = new FileOutputStream("file1.txt");
        FileOutputStream fOpS2 = new FileOutputStream("file2.txt");
        OutputStreamDoubler x = new OutputStreamDoubler(fOpS1, fOpS2);
        x.write(6);
        x.write(1);
        x.write(2);
        x.write(3);
        x.write(4);
        x.close();

    }
}
