package Lektion15.ex3;

import java.util.*;

public class MultipleChoiceFrage extends Frage {

    public MultipleChoiceFrage(String frage, String antwort, String choiceOne, String choiceTwo, String choiceThree) {
        super(frage, antwort, choiceOne, choiceTwo, choiceThree);
    }

    @Override
    public void gibFrageAus() {
        System.out.println(frage + "\n\n" + "Antwortmöglichkeiten:\n");

        List<String> choices = new ArrayList<>();
        choices.add(antwort);
        choices.add(choiceOne);
        choices.add(choiceTwo);
        choices.add(choiceThree);
        Collections.shuffle(choices);

        HashMap<String, String> possibilities = new HashMap<>();
        possibilities.put(choices.get(0), "A");
        possibilities.put(choices.get(1), "B");
        possibilities.put(choices.get(2), "C");
        possibilities.put(choices.get(3), "D");

        for (int i = 65; i < 69; i++) {
            System.out.println((char) i  + ": " + choices.get(i-65));
        }
        System.out.println();
        Scanner s = new Scanner(System.in);
        boolean antwortFalsch = true;
        while (antwortFalsch) {
            String readLine = s.nextLine();
            if (readLine.equals(antwort) || readLine.equals(possibilities.get(antwort))) {
                System.out.println("Korrekt!");
                antwortFalsch = false;
            } else {
                System.out.println("Falsche Antwort!");
            }
        }
    }
}
