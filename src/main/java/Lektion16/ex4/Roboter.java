package Lektion16.ex4;

public class Roboter extends Person {

    @Override
    public Entscheidung entscheide(Gefahren gefahr) {
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
