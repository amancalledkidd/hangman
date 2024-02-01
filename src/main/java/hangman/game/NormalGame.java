package hangman.game;

public class NormalGame extends Game{
    public NormalGame(String word) {
        super(word);
    }

    @Override
    public void gameStart() {
        super.gameStart();
        showCurrentGuess();
        System.out.println("Lives left: " + getGuesses());
    }
}
