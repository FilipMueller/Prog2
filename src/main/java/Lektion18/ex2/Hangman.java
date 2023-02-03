package Lektion18.ex2;

import java.util.Scanner;

public class Hangman {
    char[] charsGuessed;
    char[] chosenWord;

    public Hangman() {
        String[] words = {"PROGRAMMIEREN", "HOCHSCHULE", "JAVA", "SERVER", "INTELLIJ"};
        int randFactor = (int) (Math.random() * 5);
        chosenWord = words[randFactor].toCharArray();
        charsGuessed = chosenWord;
        for (int i = 0; i < chosenWord.length; i++) {
            charsGuessed[i] = '_';
        }
        printWord();
    }

    public void printWord() {
        for (char x : charsGuessed) {
            System.out.print(x);
        }
        System.out.println();
    }

    public void updateWord(String input) {
        for (int i = 0; i < chosenWord.length; i++) {
            if (chosenWord[i] == input.charAt(0)) {
                System.out.println("Korrect character!");
                charsGuessed[i] = chosenWord[i];
                printWord();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);
        String consoleInput;

        while (true) {
           consoleInput = scanner.nextLine();
           hangman.updateWord(consoleInput);
        }
    }
}
