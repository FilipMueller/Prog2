package Lektion15;

public class Angestellter {

    protected String vorname;
    protected String nachname;
    protected int identifikator;
    protected int grundGehalt;
    protected double gehaltsFaktor;
    protected String geburtsdatum;

    public Angestellter(String vorname, String nachname, int identifikator, int grundGehalt, double gehaltsFaktor, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.identifikator = identifikator;
        this.grundGehalt = grundGehalt;
        this.gehaltsFaktor = gehaltsFaktor;
        this.geburtsdatum = geburtsdatum;
    }
}
