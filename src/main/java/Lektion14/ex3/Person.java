package Lektion14.ex3;

public class Person {

    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, Adresse adresse) {
        if (checkIfUpperCase(vorname) || checkIfUpperCase(adresse.strasse) || checkIfUpperCase(adresse.ort) || checkIfStartsWithDigit(adresse)) {
            throw new RuntimeException();
        }
        this.vorname = vorname;
        this.adresse = adresse;
    }

    public boolean checkIfUpperCase(String string) {
        return !Character.isUpperCase(string.charAt(0));
    }

    public boolean checkIfStartsWithDigit(Adresse adresse) {
        return !Character.isDigit(adresse.hausnummer.charAt(0));
    }
}
