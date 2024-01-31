package hangman.command;

public class HangmanCommands extends Commands {

    @Override
    public void printGreeting() {
        System.out.println("Welcome to Hangman!!");
    }

    public int setPrintAndInputCommand(String[] commands){
        setCommands(commands);
        printCommands();
        return getIntegerInput();
    }
}
