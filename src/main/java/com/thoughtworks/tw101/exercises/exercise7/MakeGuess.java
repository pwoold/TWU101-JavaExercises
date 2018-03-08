package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class MakeGuess {

    private int guessType = -2;
    private Scanner userInput = new Scanner(System.in);

    public MakeGuess() {}

    public MakeGuess(int guessType) {
        this.guessType = guessType;
    }

    public int promptUser() {

        if (guessType == -2) {
            System.out.println("Enter a number between 1 and 100: ");
            return userInput.nextInt();
        } else if (guessType == -1) {
            System.out.println("Guess lower! ");
            return userInput.nextInt();
        } else {
            System.out.println("Guess higher! ");
            return userInput.nextInt();
        }

//        userInput.close();
//        return userGuess;

    }
}
