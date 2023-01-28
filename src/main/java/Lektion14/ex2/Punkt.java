package Lektion14.ex2;

public class Punkt {

    static int x;
    static int y;

    public static void verschiebePunkt(int zielX, int zielY) {
        x = zielX;
        y = zielY;

        if (x < 0 || y < 0 || x > 1920 || y > 1080) {
            throw new RuntimeException("Ungültige Eingabe!");
        }
    }
}
