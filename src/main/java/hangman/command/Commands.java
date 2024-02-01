package hangman.command;

import java.util.Scanner;

public abstract class Commands {
    protected final Scanner scanner = new Scanner(System.in);
    protected String[] commands = new String[]{};


    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public abstract void printGreeting();

    public void printCommands() {
        if (commands.length == 0) {
            System.out.println("\nNo current commands set\n");
        } else {
            System.out.println("\nPlease select an option: \n");
            for (int i = 0; i < commands.length; i++){
                System.out.println(i + ": " + commands[i]);
            }
        }
    }

    public String getWordInput() {
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Please enter word!");
            } else {
                return input.split(" ")[0].toLowerCase();
            }
        }
    }

    public int getIntegerInput() {
        while (true) {
            int input = scanner.nextInt();
            if (input < 0 || input > commands.length) {
                System.out.println("Please enter a number between 0 " + commands.length);
            } else {
                return input;
            }
        }

    }


//  Method to get command line characters from user
    public char getCharInput() {
//      Infinite loop requires valid letter to end.
        while (true) {
            System.out.println("Enter a letter: ");
//          Only takes first letter entered on command line
            char input = scanner.next().charAt(0);
            // if char given is not letter, displays error message, then loop starts again
            if (!Character.isLetter(input)){
                System.out.println("Incorrect character!");
            } else {
                return Character.toLowerCase(input);
            }
        }
    }


}
