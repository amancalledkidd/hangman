package hangman.game;

import java.util.ArrayList;


public abstract class Game {
    private final String word;
    private int guesses = 8;
    private char[] currentGuess;
    private final ArrayList<Character> lettersUsed = new ArrayList<>();

    public Game( String word) {
        this.word = word;
    }

    public char[] getCurrentGuess() {
        return currentGuess;
    }


    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public void secretWord() {
        char[] wordEmptySpaces = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordEmptySpaces[i] = '_';
        }
        currentGuess = wordEmptySpaces;
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
            System.out.println("You win!! \n\n");
            guesses = 0;
        } else if (guesses == 0) {
            System.out.println("You Lose!! The word was... \n\n" + word + "\n");
        }
    }

    public void gameStart() {
        System.out.println("Let the games begin");
        secretWord();
    }



    // The game functions to be included in loop
    public void gameLoop() {
        System.out.println();
        checkWin();
        showUsedLetters();
        showCurrentGuess();
        System.out.println("Lives left: " + getGuesses());

    }
}
