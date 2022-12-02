package Lektion14;

public class Person {

    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, Adresse adresse) {
        if (checkIfUpperCase(vorname) || checkIfUpperCase(adresse.strasse) || checkIfUpperCase(adresse.ort) || !Character.isDigit(adresse.hausnummer.charAt(0))) {
            throw new RuntimeException();
        }

        this.vorname = vorname;
        this.adresse = adresse;
    }

    public boolean checkIfUpperCase(String string) {
        return !Character.isUpperCase(string.charAt(0));
    }
}
