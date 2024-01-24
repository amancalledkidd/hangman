package hangman.game;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private String word = "hello";
    private int guesses = 3;

    public char[] getCurrentGuess() {
        return currentGuess;
    }

    private char[] currentGuess;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public void secretWord() {
        char[] wordSpaces = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordSpaces[i] = '_';
        }
        currentGuess = wordSpaces;
    }

    public void showCurrentGuess() {
        System.out.println(getCurrentGuess());
    }

    public void checkGuess(char letter) {
        int matches = 0;
        for (int i = 0; i < word.length(); i++) {
            if(letter == word.charAt(i)) {
                currentGuess[i] = letter;
                matches ++;
            }
        }
        if (matches >= 1) {
            System.out.println(letter + " is a correct! You got " + matches + " matches");
        } else {
            System.out.println("Incorrect, no matches!");
            guesses --;
        }
    }

    public void gameStart() {
//        Get Word from Dictionary class and store it instance variable
        secretWord();
    }
}
