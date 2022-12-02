package Lektion18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ToUpperCaseWriter implements AutoCloseable {
    Writer writer;

    public ToUpperCaseWriter(Writer writer) {
        this.writer = writer;
    }

    public void write(char c) throws IOException {
        writer.write(Character.toUpperCase(c));
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++)
            write(cbuf[i]);
    }

    public void write(String str, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++)
            write(str.charAt(i));
    }

    public void flush() throws IOException {
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("atouppercasefile.txt");
        ToUpperCaseWriter tw = new ToUpperCaseWriter(fw);
        tw.write("Suppe mit dem Löffel löffeln", 0 ,2);
        tw.close();
    }

}

