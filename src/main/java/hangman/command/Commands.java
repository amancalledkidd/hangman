package hangman.command;

import java.util.Scanner;

public class Commands {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private String[] commands = new String[]{};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void printGreeting() {
        System.out.println("Welcome to the " + this.name + "\n");
    }

    public void printCommands() {
        if (commands.length == 0) {
            System.out.println("No current commands set\n");
        } else {
            System.out.println("Please select an option: \n");
            for (int i = 0; i < commands.length; i++){
                System.out.println(i + ": " + commands[i]);
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

    public String getStringInput() {
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Please enter text!");
            } else {
                return input;
            }
        }
    }

    public char getCharInput() {
        while (true) {
            System.out.println("Enter a letter: ");
            char input = scanner.next().charAt(0);
            if (!Character.isLetter(input)){
                System.out.println("Incorrect character!");
            } else {
                return Character.toLowerCase(input);
            }
        }
    }

}
