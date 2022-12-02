package Lektion16.Schach;

public class Brett {

    boolean[][] brett = new boolean[8][8];

    public Brett()
    {

    }

    public Brett kombiniere(Brett neuesBrett)
    {
        Brett neuBrett = new Brett();
        for (int i=1; i<=8; i++)
        {
            for (int j=1; j<=8; j++)
            {
                if (brett[i-1][j-1] || neuesBrett.gibFeld(i,j))
                {
                    neuBrett.markiereFeld(i,j);
                }
            }
        }
        return neuBrett;
    }

    public void markiereFeld(int x, int y)
    {
        brett[x-1][y-1] = true;
    }

    public boolean gibFeld(int x, int y)
    {
        return brett[x-1][y-1];
    }
}
