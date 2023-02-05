package Lektion18.ex2;

public class Hangman {

    char[] charsGuessed;
    char[] chosenWord;
    String chosenWordString;
    boolean gameComplete;

    public String getChosenWordString() {
        return chosenWordString;
    }

    public char[] getCharsGuessed() {
        return charsGuessed;
    }

    public Hangman() {
        String[] words = {"PROGRAMMIEREN", "HOCHSCHULE", "JAVA", "SERVER", "INTELLIJ"};
        int randFactor = (int) (Math.random() * 5);
        chosenWordString = words[randFactor];
        chosenWord = words[randFactor].toCharArray();
        charsGuessed = words[randFactor].toCharArray();
        gameComplete = false;
        for (int i = 0; i < chosenWord.length; i++) {
            charsGuessed[i] = '_';
        }
    }

    public void updateWord(String input) {
        if (chosenWordString.contains(input)) {
            int missingCharacters = 0;
            for (int i = 0; i < chosenWord.length; i++) {
                if (chosenWord[i] == input.charAt(0)) {
                    charsGuessed[i] = chosenWord[i];
                }
                if (charsGuessed[i] == '_') {
                    missingCharacters++;
                }
            }
            if (missingCharacters == 0) {
                gameComplete = true;
            }
        }
    }
}
