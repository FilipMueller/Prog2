package Lektion20;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Card implements Comparable<Card>{

    String type;
    String name;
    int number;

    public Card(String type, String name, int number) {
        this.type = type;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ps.printf("%s %s", type, name);
        ps.flush();
        return baos.toString();
    }

    @Override
    public int compareTo(Card lastCard) {
        if (this.type.equals(lastCard.type)) {
               return Integer.compare(lastCard.number, this.number);
        }
        if (this.type.equals("Kreuz") && !lastCard.name.equals("B")) return -1;

        if (this.type.equals("Pik") && !lastCard.type.equals("Kreuz") && !lastCard.name.equals("B")) return -1;

        if (this.type.equals("Herz") && !lastCard.type.equals("Pik") && !lastCard.type.equals("Kreuz") && !lastCard.name.equals("B")) return -1;

        if (this.name.equals("B") && !lastCard.name.equals("B")) return -1;

//        if (this.name.equals("B") && this.type.equals("Kreuz") && lastCard.name.equals("B"))

        return 0;
    }
}
