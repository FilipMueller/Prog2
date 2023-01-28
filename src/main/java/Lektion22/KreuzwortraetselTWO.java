package Lektion22;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class KreuzwortraetselTWO implements Comparator<String> {

    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<>();
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return -1;
        else if (o1.length() == o2.length()) {
            if (o1.compareTo(o2) < 0) {
                return -1;
            }
            if (o1.compareTo(o2) == 0) {
                return 0;
            }
            if (o1.compareTo(o2) > 0) {
                return 1;
            }
        }
        else return 1;
        return 0;
    }
}
