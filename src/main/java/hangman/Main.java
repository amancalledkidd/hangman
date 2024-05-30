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

            if (intInput == 1) {
                isOn = false;
                System.out.println("Quitting...");
                continue;
            }

            int gameTypeInput = commands.setPrintAndInputCommand(gameCommandOptions);

                if (gameTypeInput == 0) {
                    NormalGame game = new NormalGame(DictionaryUtils.generateWord().toLowerCase(), commands);
                    game.run();

                } else if (gameTypeInput == 1) {
                    System.out.println("Custom mode selected");
                    CustomGame game = new CustomGame(commands.getWordInput(), commands);
                    game.run();

                }

            }
        }
}
