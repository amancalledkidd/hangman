# Hangman Game

The aim of this project was to create a Java based Hangman game. While creating this game I also wanted to apply the four pillars of OOP

## Table of Contents
- [Overview](#overview)
- [Installation](#installation)
  - [IntelliJ IDEA](#intellij-idea)
  - [Visual Studio Code](#visual-studio-code)
- [Classes](#classes)
  - [Game](#game)
  - [CustomGame](#customgame)
  - [Commands](#commands)
  - [HangmanCommands](#hangmancommands)
  - [DictionaryUtils](#dictionaryutils)
  - [Main](#main)
- [OOP Principles](#oop-principles)
  - [Encapsulation](#encapsulation)
  - [Abstraction](#abstraction)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)

## Overview

The Hangman game allows a player to guess a word by suggesting letters within a certain number of guesses. This version includes the traditional random word or an option for a custom game where you can choose a word, great for two players.


## Installation

### IntelliJ IDEA


1. **Clone the repository:**
   ```sh
   git clone https://github.com/amancalledkidd/hangman.git
   

2. **Open IntelliJ IDEA and select "Open":**
   ```sh
   Navigate to the cloned repository and select the project folder.
   

3. **Set up the project:**
   ```sh
   IntelliJ IDEA should automatically detect the project structure and set it up.
   
   If not, ensure the project SDK is set to `Amazon Corretto version 11`.
   

4. **Build the project:**
   ```sh
   Go to Build > Build Project or press Ctrl + F9.
   
### VS Code


1. **Clone the repository:**
   ```sh
   git clone https://github.com/amancalledkidd/hangman.git
   

2. **Open Visual Studio Code and select "Open Folder"**
   ```sh
   Navigate to the cloned repository and select the project folder.
   

3. **Install the Java Extension Pack:**
   ```sh
   Go to the Extensions view (Ctrl + Shift + X) and install the "Java Extension Pack" by Microsoft.
   

4. **Open the project in VS Code:**
   ```sh
   Open the src folder to view the Java files.
   

5. **Build the project:**
   
   Open the terminal in VS Code (Ctrl + `) and run
   ```sh
   javac -d bin src/hangman/**/*.java
   
   
## Classes

### Game

The `Game` class is an abstract base class that manages the core functionality of the Hangman game.

- **Fields:**
  - `String word`: The word to be guessed.
  - `int guesses`: The number of guesses allowed.
  - `char[] currentGuess`: The current state of the guessed word.
  - `ArrayList<Character> lettersUsed`: List of letters that have been guessed.

- **Methods:**
  - `Game(String word)`: Constructor that initializes the game with a word.
  - `char[] getCurrentGuess()`: Returns the current guessed state of the word.
  - `int getGuesses()`: Returns the number of remaining guesses.
  - `void setGuesses(int guesses)`: Sets the number of allowed guesses.
  - `void secretWord()`: Initializes the current guess with underscores.
  - `void showCurrentGuess()`: Prints the current guessed state.
  - `void checkGuess(char letter)`: Checks if the guessed letter is in the word and updates the state accordingly.
  - `void showUsedLetters()`: Prints the list of used letters.
  - `void checkWin()`: Checks if the game has been won or lost.
  - `void gameStart()`: Starts the game.
  - `void gameLoop()`: Main game loop that updates the game state.

### CustomGame

The `CustomGame` class extends the `Game` class, adding the ability to start the game with a custom number of guesses.

- **Constructor:**
  - `CustomGame(String word)`: Calls the superclass constructor with the word.
  
- **Methods:**
  - `void gameStart(int guesses)`: Sets up the game with a custom number of guesses and initializes the game state.

### Commands

The `Commands` class handles user input and provides common methods for interacting with the player.

- **Fields:**
  - `Scanner scanner`: Scanner object for reading user input.
  - `String[] commands`: Array of available commands.

- **Methods:**
  - `void setCommands(String[] commands)`: Sets the available commands.
  - `abstract void printGreeting()`: Abstract method to print a greeting message.
  - `void printCommands()`: Prints the list of available commands.
  - `String getWordInput()`: Gets a word input from the user.
  - `int getIntegerInput()`: Gets an integer input from the user.
  - `char getCharInput()`: Gets a character input from the user.

### HangmanCommands

The `HangmanCommands` class extends the `Commands` class, providing specific implementations for the Hangman game.

- **Methods:**
  - `void printGreeting()`: Prints a greeting message for the Hangman game.
  - `int setPrintAndInputCommand(String[] commands)`: Sets and prints the commands, then gets user input.
  - `int getGuessInput()`: Gets a valid guess input from the user.

### DictionaryUtils

The `DictionaryUtils` class provides a utility for generating random words from a predefined list.

- **Fields:**
  - `List<String> words`: A static list of predefined words.

- **Methods:**
  - `static String generateWord()`: Generates and returns a random word from the list.

### Main

The `Main` class contains the entry point of the application and manages the game flow.

- **Methods:**
  - `public static void main(String[] args)`: Main method that starts the game and handles user interaction.

## OOP Principles

### Encapsulation

Encapsulation is used to protect the internal state of objects and only expose necessary methods. For example:
- The `Game` class keeps its fields (`word`, `guesses`, `currentGuess`, `lettersUsed`) private and provides public getter and setter methods to access and modify them.

### Abstraction

Abstraction is achieved through abstract classes and methods that define a blueprint for subclasses. For example:
- The `Game` class is abstract, defining core methods that must be implemented or extended by subclasses.
- The `Commands` class provides abstract methods for subclasses to implement specific behaviors.

### Inheritance

Inheritance allows classes to inherit properties and methods from other classes. For example:
- The `CustomGame` class inherits from the `Game` class and adds custom functionality.
- The `HangmanCommands` class inherits from the `Commands` class and provides specific implementations for the Hangman game.

### Polymorphism

Polymorphism enables objects to be treated as instances of their parent class. For example:
- The `CustomGame` object can be used wherever a `Game` object is expected, allowing for flexible and reusable code.

