package Lektion16.ex1;

public class LaeuferImpl extends AbstractFigur implements Laeufer {

    public LaeuferImpl(int x, int y)
    {
        super(x, y);
    }

    @Override
    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        brett.markiereFeld(x,y);
        for (int i = 1; i <= 8; i++) {
            if (x - i > 0 && y + i < 9) {
                brett.markiereFeld(x-i, y+i);
            }
            if (x + i < 9 && y + i < 9) {
                brett.markiereFeld(x+i, y+i);
            }
            if (x - i > 0 && y - i > 0) {
                brett.markiereFeld(x-i, y-i);
            }
            if (x + i < 9 && y - i > 0) {
                brett.markiereFeld(x+i, y-i);
            }
        }
        return brett;
    }

    public static void main(String[] args) {
        LaeuferImpl l = new LaeuferImpl(8,5 );
        Brett brett = l.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
