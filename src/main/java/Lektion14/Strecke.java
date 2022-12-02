package Lektion14;

public class Strecke {

    int A;
    int B;

    public Strecke(int A, int B) {
        if (A > B) {
            this.B = A;
            this.A = B;
        } else {
            this.A = A;
            this.B = B;
        }
    }

    public boolean ueberschneiden(Strecke strecke) {
        if (this.A >= strecke.A && this.A >= strecke.B) {
            return false;
        }
        else if (this.B <= strecke.A) {
            return false;
        }
        else return true;
    }

    @Override
    public String toString ()
    {
        int anzahlStriche = B - A;
        StringBuilder Strich = new StringBuilder("");
        System.out.print(A);
        if (anzahlStriche == 0) {
            return "";
        } else {
            while (anzahlStriche != 1) {
                Strich.append("-");
                anzahlStriche--;
            }
            System.out.print(Strich);
            System.out.print(B);
            return "";
        }
    }
}
