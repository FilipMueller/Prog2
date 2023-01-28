package Lektion15.ex3;

public class Main {

    public static void main(String[] args) {
        Frage frage1 = new Textfrage("Was ist die Hauptstadt von Deutschland?", "Berlin");
        Frage frage2 = new Textfrage("Wer ist der beste Freund des Menschen?", "Hund");

        Frage frage3 = new MultipleChoiceFrage("Wie viele Protonen hat ein Wasserstoff-Atom?", "1", "4", "2", "0");
        Frage frage4 = new MultipleChoiceFrage("Wie viele Sekunden hat ein Tag?", "86400", "1200600", "360800", "46400");

//        frage1.gibFrageAus();
//        frage2.gibFrageAus();
        frage3.gibFrageAus();
        frage4.gibFrageAus();
    }
}
