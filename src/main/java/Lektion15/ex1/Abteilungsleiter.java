package Lektion15.ex1;

public class Abteilungsleiter extends Angestellter {

    public Abteilungsleiter(String vorname, String nachname, int identifikator, int grundGehalt, double gehaltsFaktor, String geburtsdatum) {
        super(vorname, nachname, identifikator, grundGehalt, gehaltsFaktor, geburtsdatum);
    }

    public void befoerdern(Angestellter angestellter) {
        angestellter.gehaltsFaktor *= 0.10 + angestellter.gehaltsFaktor;
    }
}
