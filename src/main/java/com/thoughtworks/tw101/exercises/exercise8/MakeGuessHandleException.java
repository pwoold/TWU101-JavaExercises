package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;


public class MakeGuessHandleException {

    private int guessType = -2;

    public MakeGuessHandleException() {
    }

    public MakeGuessHandleException(int guessType) {
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
        int userGuess = 0;
        try {
            userGuess = Integer.parseInt(userGuessUnParsed);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.exit(1);
        }
        return userGuess;
    }
}

