package Lektion21;

public class MainexONE {
    public static void main(String[] args) {
        Naehrstoffangaben n = new Naehrstoffangaben.Builder(50,2)
                .eiweiss(350)
                .build();

        Naehrstoffangaben n2 = new Naehrstoffangaben.Builder(30, 4)
                .build();
    }
}
