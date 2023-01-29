package Lektion17.ex3;

import com.sun.media.sound.FFT;

import java.io.*;
import java.util.Scanner;

public class Zeitmessung {
    static long copyImproved(InputStream is, OutputStream os, int bytes) throws IOException {
        long startTime = System.currentTimeMillis();
        byte[] amountOfBytes = new byte[bytes];
        int readBytes;
        do {
            readBytes = is.read(amountOfBytes);
            if (readBytes != -1) os.write(amountOfBytes, 0, readBytes);
        }
        while (readBytes != -1);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static String searchFileToBeCopied() {
        Scanner scanner = new Scanner(System.in);
        String path = "";
        boolean wrongPath = true;
        while (wrongPath) {
            System.out.println("Dateipfad angeben: ");
            path = scanner.nextLine();
            try {
                if (new File(path).exists()) {
                    wrongPath = false;
                } else {
                    throw new FileNotFoundException();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Datei konnte nicht gefunden werden\n");
            }
        }
        return path;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = searchFileToBeCopied();
        InputStream fis = new FileInputStream(path);
        long durationBuffered = 0;
        long durationUnbuffered = 0;
        long durationByteArray = 0;
        for (int i = 10; i >= 0; i--) {
            try (
                 InputStream bis = new BufferedInputStream(fis);
                 OutputStream fosOne = new FileOutputStream("copyBuffered.mp3");
                 OutputStream bos = new BufferedOutputStream(fosOne);
                 OutputStream fosTwo = new FileOutputStream("copyUnbuffered.mp3");
                 OutputStream fosThree = new FileOutputStream("copyByteArray.mp3")) {
                fis = new FileInputStream(path);
                durationBuffered += copyImproved(bis, bos, 1);
                fis = new FileInputStream(path);
                durationUnbuffered += copyImproved(fis, fosTwo, 1);
                fis = new FileInputStream(path);  
                durationByteArray += copyImproved(fis, fosThree, 1024);
                //WHY DO I NEED TO INITIATE THE INPUTSTREAM EVERYTIME, DOESNT TRY-WITH-RESCOURCES DO THAT??!??!?!?!??!?!?
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(durationBuffered / 10);
        System.out.println(durationUnbuffered / 10);
        System.out.println(durationByteArray / 10);
    }
}
