package Lektion14.ex4;

public class Strecke {

    int startPoint;
    int endPoint;

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public Strecke(int A, int B) {
        if (A > B) {
            this.endPoint = A;
            this.startPoint = B;
        } else {
            this.startPoint = A;
            this.endPoint = B;
        }
    }

    public boolean ueberschneiden(Strecke strecke) {
        if (this.startPoint >= strecke.startPoint && this.startPoint >= strecke.endPoint) {
            return false;
        }
        else return this.endPoint > strecke.startPoint;
    }

    @Override
    public String toString ()
    {
        int anzahlStriche = endPoint - startPoint;
        StringBuilder Strich = new StringBuilder();
        System.out.print(startPoint);
        if (anzahlStriche == 0) {
            return "";
        } else {
            while (anzahlStriche != 0) {
                Strich.append("-");
                anzahlStriche--;
            }
            System.out.print(Strich);
            System.out.print(endPoint);
            return "";
        }
    }
}
