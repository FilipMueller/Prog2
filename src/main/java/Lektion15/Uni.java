package Lektion15;

public class Uni {

    private static Person2[] personen;

    private static void fuelleArray() {
        personen = new Person2[100];

        for (int i=0; i<100; i++) {
            if (i % 2 == 0) {
                personen[i] = new Student("Programmieren");
            }
            else {
                personen[i] = new Professor("Programmieren");
            }
        }
    }

    private static void ausgabe() {
        fuelleArray();
        for (int i=0; i<100; i++) {
            personen[i].gibTaetigkeitAus();
        }
    }

    public static void main(String[] args) {
        ausgabe();
    }
}
