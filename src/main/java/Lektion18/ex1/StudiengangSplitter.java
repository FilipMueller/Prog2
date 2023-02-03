package Lektion18.ex1;

import java.io.*;

public class StudiengangSplitter {
    public static void splitStudiengaenge(File dateiname) {
        try (FileOutputStream fos1 = new FileOutputStream("WInfNr.txt");
            OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
            FileOutputStream fos2 = new FileOutputStream("InfNr.txt");
            OutputStreamWriter osw2 = new OutputStreamWriter(fos2);
            FileOutputStream fos3 = new FileOutputStream("ECNr.txt");
            OutputStreamWriter osw3 = new OutputStreamWriter(fos3);
            BufferedReader br = new BufferedReader(new FileReader(dateiname)))
        {
            do
            {
                String line = br.readLine();
                if (line == null) break;
                int matrikelNummer = Integer.parseInt(line);
                if (matrikelNummer >= 5000000 && matrikelNummer <= 5099999) {
                    osw1.write(line + "\n");
                } else if (matrikelNummer >= 5100000 && matrikelNummer <= 5199999) {
                    osw2.write(line + "\n");
                } else if (matrikelNummer >= 6100000 && matrikelNummer <= 6199999) {
                    osw3.write(line + "\n");
                } else {
                    throw new RuntimeException("Invalid Matrikelnummer");
                }
            }
            while(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static File createCSV() {
        File file = new File("D:\\Studium\\BIN2\\Programmieren II\\Prog2\\MatrikelNummern.txt");
        try (Writer wr = new FileWriter("MatrNr.txt")) {
            int anzahlMatrikelnummern = 100;
            for (int i = 0; i < anzahlMatrikelnummern; i++) {
                wr.write(generateRandomNumber() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static int generateRandomNumber() {
        int randFactor = (int) (Math.random() * 3);
        double randFactor2 = Math.random();
        switch (randFactor) {
            case 0:
                return (int) (randFactor2 * 200000) + 5000000;
            case 1:
                return (int) (randFactor2 * 100000) + 5100000;
            case 2:
                return (int) (randFactor2 * 100000) + 6100000;
            default:
                throw new RuntimeException("randFactor2 != 0, 1, 2");
        }
    }

    public static void main(String[] args) throws IOException {
        splitStudiengaenge(createCSV());
    }
}
