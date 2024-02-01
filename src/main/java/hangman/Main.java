package hangman;

import hangman.command.HangmanCommands;
import hangman.dictionary.DictionaryUtils;
import hangman.game.CustomGame;
import hangman.game.NormalGame;

public class Main {
    public static void main(String[] args) {
        HangmanCommands commands = new HangmanCommands();
        boolean isOn = true;

        commands.printGreeting();


        String[] commandOptions = new String[]{"Play Hangman", "Quit" };
        String[] gameCommandOptions = new String[]{"Normal Mode", "Custom Game"};



        while (isOn) {
            int intInput = commands.setPrintAndInputCommand(commandOptions);

            if (intInput == 0) {
                int gameTypeInput = commands.setPrintAndInputCommand(gameCommandOptions);
                if (gameTypeInput == 0) {
                    NormalGame game = new NormalGame(DictionaryUtils.generateWord().toLowerCase());
                    game.gameStart();

                    while (game.getGuesses() > 0) {
                        game.checkGuess(commands.getCharInput());
                        game.gameLoop();
                    }

                } else if (gameTypeInput == 1) {
                    System.out.println("Custom mode selected");
                    CustomGame game = new CustomGame(commands.getWordInput());
                    System.out.println("Please enter the amount of guesses you would like: ");


                    game.gameStart(commands.getGuessInput());

                    while (game.getGuesses() > 0) {
                        game.checkGuess(commands.getCharInput());
                        game.gameLoop();
                    }
                }

            } else {
                isOn = false;
                System.out.println("Quiting...");
            }
        }
    }
}
