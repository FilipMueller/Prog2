package Lektion17;

import java.io.*;
import java.util.Scanner;

public class ex3 {

    static void copyImproved(InputStream is, OutputStream os, int bytes) {
        long startTime = System.currentTimeMillis();
        try (InputStream i = is) {
            byte[] b = new byte[bytes];
            int n;
            do {
                n = is.read(b);
                if (n != -1) os.write(b, 0, n);
            }
            while (n != -1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration);
    }

    public static void pfadEingeben() {
        Scanner scanner = new Scanner(System.in);
        boolean wrongPath = true;
        while (wrongPath) {
            System.out.println("Dateipfad angeben: ");
            try {
                FileOutputStream fos = new FileOutputStream("copy.mp3");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                String path = scanner.nextLine();
                FileInputStream fis = new FileInputStream(path);
                copyImproved(fis, bos, 1);                   //BufferedOutputStream
//                copyImproved(fis, fos, 1);                   //FileOutputStream
//                copyImproved(fis, fos, 1024);                //byte[] der Größe 1024
                wrongPath = false;
            }
            catch (FileNotFoundException e) {
                System.out.println("Datei konnte nicht gefunden werden");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        pfadEingeben();
    }
}
