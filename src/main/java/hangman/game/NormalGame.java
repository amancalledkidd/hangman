package hangman.game;

import hangman.command.HangmanCommands;

public class NormalGame extends Game{
    public NormalGame(String word, HangmanCommands commands) {
        super(word, commands);
    }

    @Override
    public void gameStart() {
        super.gameStart();
        showCurrentGuess();
        System.out.println("Lives left: " + getGuesses());
    }
}
