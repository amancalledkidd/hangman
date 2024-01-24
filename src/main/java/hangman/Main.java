package hangman;

import hangman.command.Commands;
import hangman.game.Game;

public class Main {
    public static void main(String[] args) {
        Commands commands = new Commands();
        boolean isOn = true;

        commands.setName("Hangman");
        commands.printGreeting(); // "Welcome to the Home commands"


        String[] commandOptions = new String[]{"Play Hangman", "Quit" };
        commands.setCommands(commandOptions);

        commands.printCommands(); // "Please select an option" "0: Enter a string"  "1: Do something else..." "2: Quit"

        while (isOn) {
            int intInput = commands.getIntegerInput();

            if (intInput == 0) {
                Game game = new Game();
                game.gameStart();
                while (game.getGuesses() > 0) {
                    game.showCurrentGuess();
                    game.checkGuess(commands.getCharInput());
                }

            } else {
                isOn = false;
                System.out.println("Quiting...");
            }
        }
    }
}
