package Lektion16.ex4;

import java.util.Random;

public class Cyborg extends Person {
    private Mensch mensch;
    private Roboter roboter;
    private Random random = new Random();

    public Cyborg(Mensch mensch, Roboter roboter) {
        this.mensch = mensch;
        this.roboter = roboter;
    }

    public Mensch getMensch() {
        return mensch;
    }

    public Roboter getRoboter() {
        return roboter;
    }

    @Override
    public Entscheidung entscheide(Gefahren gefahr) {
        Entscheidung menschEntscheidung = mensch.entscheide(gefahr);
        Entscheidung roboterEntscheidung = roboter.entscheide(gefahr);
        if (menschEntscheidung == roboterEntscheidung) {
            return menschEntscheidung;
        } else {
            int chance = random.nextInt(50);
            if (chance < 25) {
                return menschEntscheidung;
            } else {
                return roboterEntscheidung;
            }
        }
    }
}
