package Sandbox;

public class valueTypesAndReferenceTypes {
    public static void main(String[] args) {

        //durch tt = pp; -> Copy by Reference -> durch Veränderung an tt wird auch pp geändert
        char[] pp;
        char[] tt;
        String[] words = {"PROGRAMMIEREN", "HOCHSCHULE", "JAVA", "SERVER", "INTELLIJ"};
        int randFactor = (int) (Math.random() * 5);
        pp = words[randFactor].toCharArray();
        tt = pp;
        for (int i = 0; i < pp.length; i++) {
            tt[i] = '_';
        }
        for (int z = 0; z < pp.length; z++) {
            System.out.print(tt[z]);
        }
        System.out.println();
        for (int z = 0; z < pp.length; z++) {
            System.out.print(pp[z]);
        }

        String x = "Hallo";
        String y = x;

        y = "iallo";
        System.out.println(x);
        System.out.println(y);
    }
}