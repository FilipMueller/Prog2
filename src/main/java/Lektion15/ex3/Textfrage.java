package Lektion15.ex3;

import java.util.Scanner;

public class Textfrage extends Frage {

    public Textfrage(String frage, String antwort) {
        super(frage, antwort);
    }

    @Override
    public void gibFrageAus() {
        System.out.println(frage + "\n\n" + "Antwort:\n" );
        Scanner s = new Scanner(System.in);
        boolean antwortFalsch = true;
        while (antwortFalsch) {
            String readLine = s.nextLine();
            if (readLine.equals(antwort)) {
                System.out.println("Korrekt!");
                antwortFalsch = false;
            } else {
                System.out.println("Falsche Antwort!");
            }
        }
    }
}
