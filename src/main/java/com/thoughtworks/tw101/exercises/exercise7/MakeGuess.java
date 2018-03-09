package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class MakeGuess {

    private int guessType = -2;

    public MakeGuess() {}

    public MakeGuess(int guessType) {
        this.guessType = guessType;
    }

    public void promptUser() {

        if (guessType == -2) {
            System.out.println("Enter a number between 1 and 100: ");
        } else if (guessType == -1) {
            System.out.println("Guess lower! ");
        } else {
            System.out.println("Guess higher! ");
        }
    }

    public int findGuess(Scanner userInput) {
        promptUser();
        String userGuessUnParsed = userInput.nextLine();
        int userGuess = Integer.parseInt(userGuessUnParsed);
        return userGuess;
    }
}
