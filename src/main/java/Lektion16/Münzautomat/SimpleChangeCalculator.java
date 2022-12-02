package Lektion16.Münzautomat;

public class SimpleChangeCalculator {
    public int[] getChange(int euros, int cent)
    {
        return new int[] {
                euros * 100 + cent, // alles in 1-Cent-Muenzen
                0,					// keine 2-Cent-Muenzen
                0,					// keine 5-Cent-Muenzen
                0,					// keine 10-Cent-Muenzen
                0,					// keine 20-Cent-Muenzen
                0,					// keine 50-Cent-Muenzen
                0,					// keine 1-Euro-Muenzen
                0					// keine 2-Euro-Muenzen
        };
    }
}
