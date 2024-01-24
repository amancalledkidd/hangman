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


        while (isOn) {
            commands.printCommands();
            int intInput = commands.getIntegerInput();

            if (intInput == 0) {
                Game game = new Game();
                game.gameStart();

                while (game.getGuesses() > 0) {
                    game.showCurrentGuess();
                    System.out.println(game.getGuesses() + " :Lives left");
                    game.checkGuess(commands.getCharInput());
                    game.checkWin();
                    game.showUsedLetters();
                }


            } else {
                isOn = false;
                System.out.println("Quiting...");
            }
        }
    }
}
