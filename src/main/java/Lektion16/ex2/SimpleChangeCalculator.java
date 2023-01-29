package Lektion16.ex2;

public class SimpleChangeCalculator implements ChangeCalculator {


    @Override
    public int[] getChange(int euros, int cent) {

        int[] change = new int[8];
        int centBetrag = (euros * 100) + cent;

        while(centBetrag != 0) {
            if (centBetrag >= 200) {
                change[7] = centBetrag / 200;
                centBetrag -= change[7] * 200;
            }
            if (centBetrag >= 100) {
                change[6] = centBetrag / 100;
                centBetrag -= change[6] * 100;
            }
            if (centBetrag >= 50) {
                change[5] = centBetrag / 50;
                centBetrag -= change[5] * 50;
            }
            if (centBetrag >= 20) {
                change[4] = centBetrag / 20;
                centBetrag -= change[4] * 20;
            }
            if (centBetrag >= 10) {
                change[3] = centBetrag / 10;
                centBetrag -= change[3] * 10;
            }
            if (centBetrag >= 5) {
                change[2] = centBetrag / 5;
                centBetrag -= change[2] * 5;
            }
            if (centBetrag >= 2) {
                change[1] = centBetrag / 2;
                centBetrag -= change[1] * 2;
            } else {
                change[0] = centBetrag;
                centBetrag = 0;
            }
        }
        return change;
    }
}
