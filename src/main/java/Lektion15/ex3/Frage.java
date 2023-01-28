package Lektion15.ex3;

public abstract class Frage {

    String frage;
    String antwort;
    String choiceOne;
    String choiceTwo;
    String choiceThree;

    public Frage(String frage, String antwort) {
        this.frage = frage;
        this.antwort = antwort;
    }

    public Frage(String frage, String antwort, String choiceOne, String choiceTwo, String choiceThree) {
        this.frage = frage;
        this.antwort = antwort;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree = choiceThree;
    }

    public abstract void gibFrageAus();
}
