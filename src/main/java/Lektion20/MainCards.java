package Lektion20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCards {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<Card>(32);
        deck.add(new Card("Karo", "7", 7));
        deck.add(new Card("Karo", "8", 8));
        deck.add(new Card("Karo", "9", 9));
        deck.add(new Card("Karo", "10", 12));
        deck.add(new Card("Karo", "B", 14));
        deck.add(new Card("Karo", "D", 10));
        deck.add(new Card("Karo", "K", 11));
        deck.add(new Card("Karo", "A", 13));
        deck.add(new Card("Herz", "7", 7));
        deck.add(new Card("Herz", "8", 8));
        deck.add(new Card("Herz", "9", 9));
        deck.add(new Card("Herz", "10", 12));
        deck.add(new Card("Herz", "B", 14));
        deck.add(new Card("Herz", "D", 10));
        deck.add(new Card("Herz", "K", 11));
        deck.add(new Card("Herz", "A", 13));
        deck.add(new Card("Kreuz", "7", 7));
        deck.add(new Card("Kreuz", "8", 8));
        deck.add(new Card("Kreuz", "9", 9));
        deck.add(new Card("Kreuz", "10", 12));
        deck.add(new Card("Kreuz", "B", 14));
        deck.add(new Card("Kreuz", "D", 10));
        deck.add(new Card("Kreuz", "K", 11));
        deck.add(new Card("Kreuz", "A", 13));
        deck.add(new Card("Pik", "7", 7));
        deck.add(new Card("Pik", "8", 8));
        deck.add(new Card("Pik", "9", 9));
        deck.add(new Card("Pik", "10", 12));
        deck.add(new Card("Pik", "B", 14));
        deck.add(new Card("Pik", "D", 10));
        deck.add(new Card("Pik", "K", 11));
        deck.add(new Card("Pik", "A", 13));

        List<Card> hand = new ArrayList<Card>(10);
        int fac = 32;
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * fac--);
            hand.add(deck.remove(rand));
        }
        System.out.println(hand.toString());
        Collections.sort(hand);
        System.out.println(hand.toString());
    }
}
