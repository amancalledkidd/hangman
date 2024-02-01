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

    public int getGuessInput() {
        while (true) {
            int input = scanner.nextInt();
            if (input < 1 || input > 26) {
                System.out.println("Please enter a number between 0 & 25");
            } else {
                return input;
            }
        }

    }
}
