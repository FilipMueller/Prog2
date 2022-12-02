package Lektion20;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardTest {
    List<Card> deck1 = new ArrayList<Card>(10);
    List<Card> deck2 = new ArrayList<Card>(10);
    List<Card> deck3 = new ArrayList<Card>(10);

    @Test
    public void vierBuben() {
        deck1.add(new Card("Karo", "7", 7));
        deck1.add(new Card("Karo", "B", 14));
        deck1.add(new Card("Karo", "K", 11));
        deck1.add(new Card("Herz", "B", 14));
        deck1.add(new Card("Herz", "D", 10));
        deck1.add(new Card("Kreuz", "9", 9));
        deck1.add(new Card("Kreuz", "10", 12));
        deck1.add(new Card("Kreuz", "B", 14));
        deck1.add(new Card("Pik", "8", 8));
        deck1.add(new Card("Pik", "B", 14));

        System.out.println(deck1.toString());
        Collections.sort(deck1);
        System.out.println(deck1.toString());
    }
}
