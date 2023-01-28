package Lektion15.ex1;

public class Angestellter {

    protected String vorname;
    protected String nachname;
    protected int identifikator;
    protected int grundGehalt;
    protected double gehaltsFaktor;
    protected String geburtsdatum;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getIdentifikator() {
        return identifikator;
    }

    public void setIdentifikator(int identifikator) {
        this.identifikator = identifikator;
    }

    public int getGrundGehalt() {
        return grundGehalt;
    }

    public void setGrundGehalt(int grundGehalt) {
        this.grundGehalt = grundGehalt;
    }

    public double getGehaltsFaktor() {
        return gehaltsFaktor;
    }

    public void setGehaltsFaktor(double gehaltsFaktor) {
        this.gehaltsFaktor = gehaltsFaktor;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Angestellter(String vorname, String nachname, int identifikator, int grundGehalt, double gehaltsFaktor, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.identifikator = identifikator;
        this.grundGehalt = grundGehalt;
        this.gehaltsFaktor = gehaltsFaktor;
        this.geburtsdatum = geburtsdatum;
    }
}
