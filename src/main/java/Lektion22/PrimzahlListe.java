package Lektion22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlListe extends Thread {

    List<Integer> zahlenZumTesten;
    Map<Integer, Boolean> ergebnis = new HashMap<>();

    public PrimzahlListe(List<Integer> zahlenZumTesten) {
        this.zahlenZumTesten = zahlenZumTesten;
    }

    public boolean testeObPrimzahl(int zahlZumTesten) {
        if (zahlZumTesten < 2) return false;
        for (int divisor = 2; divisor < zahlZumTesten; divisor++)
            if (zahlZumTesten % divisor == 0) return false;
        return true;
    }

    @Override
    public void run() {
        for (int zahl : zahlenZumTesten) {
            ergebnis.put(zahl, testeObPrimzahl(zahl));
        }
        for (Map.Entry e : ergebnis.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(97);
        l1.add(43);
        l1.add(57);

        List<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(28);
        l2.add(30);

        PrimzahlListe p1 = new PrimzahlListe(l1);
        p1.start();
        PrimzahlListe p2 = new PrimzahlListe(l2);
        p2.start();
    }
}
