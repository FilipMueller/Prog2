package Lektion15;

public class Ablteilung {

    public static void main(String[] args) {
        Angestellter Peter = new Angestellter("Peter", "Müller", 1234, 2500, 1, "17.07.1982");
        Angestellter Gerd = new Angestellter("Gerd", "Hansen", 5123, 2500, 1, "09.12.1986");
        Abteilungsleiter Hans = new Abteilungsleiter("Hans", "Bauer", 2133, 4000, 2, "22.05.1976");
        Hans.befoerdern(Gerd);
    }
}
