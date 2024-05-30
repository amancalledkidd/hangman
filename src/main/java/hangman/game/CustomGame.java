package hangman.game;

import hangman.command.Commands;
import hangman.command.HangmanCommands;

public class CustomGame extends Game {
    public CustomGame(String word, HangmanCommands commands) {
        super(word, commands);
    }

    // A startup function that sets up the custom mode
    @Override
    public void gameStart() {
        System.out.println("Please enter the amount of guesses you would like: ");
        setGuesses(commands.getGuessInput());
        secretWord();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        showCurrentGuess();
        System.out.println("Lives left: " + getGuesses());
    }
}
