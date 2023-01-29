package Lektion16.ex4;

import java.util.Random;

public class Mensch extends Person {
    private Random random = new Random();

    @Override
    public Entscheidung entscheide(Gefahren gefahr) {
        int chance = random.nextInt(100);
        if (chance < 25) {
            return Entscheidung.UNENTSCHIEDEN;
        } else {
            switch (gefahr) {
                case GEFAHR_LINKS:
                    return Entscheidung.RECHTS;
                case GEFAHR_RECHTS:
                    return Entscheidung.LINKS;
                case GEFAHR_VORNE:
                    return Entscheidung.BREMSEN;
            }
            return null;
        }
    }
}
