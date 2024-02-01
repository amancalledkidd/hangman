package hangman.game;

public class CustomGame extends Game {
    public CustomGame(String word) {
        super(word);
    }

    // A startup function that sets up the custom mode
    public void gameStart(int guesses) {
        secretWord();
        setGuesses(guesses);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        showCurrentGuess();
        System.out.println("Lives left: " + getGuesses());
    }
}
