package hangman.game;

import hangman.dictionary.DictionaryUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private String word = DictionaryUtils.generateWord().toLowerCase();
    private int guesses = 3;
    private char[] currentGuess;
    private ArrayList<Character> lettersUsed = new ArrayList<>();


    public char[] getCurrentGuess() {
        return currentGuess;
    }


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
        if (lettersUsed.contains(letter)) {
            System.out.println("You have already used this letter!");
            return;
        }

        lettersUsed.add(letter);
        int matches = 0;
        for (int i = 0; i < word.length(); i++) {
            if(letter == word.charAt(i)) {
                currentGuess[i] = letter;
                matches ++;
            }
        }
        if (matches > 0) {
            System.out.println(letter + " is a correct! You got " + matches + " matches");
        } else {
            System.out.println("Incorrect, no matches!");
            guesses --;
        }
    }

    public void showUsedLetters(){
        System.out.println("Letters used: " + lettersUsed);
    }
    public void checkWin() {
        String answer = String.copyValueOf(getCurrentGuess());
        if (answer.equals(word)) {
            System.out.println("You win!!");
            guesses = 0;
        } else if (guesses == 0) {
            System.out.println("You Lose!! The word was... \n\n" + word + "\n");
        }
    }

    public void gameStart() {

        secretWord();
    }
}
