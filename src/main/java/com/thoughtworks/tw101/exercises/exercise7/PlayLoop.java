package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class PlayLoop {

    private int compareValue;
    private GuessChecker checker;

    public PlayLoop(int compareValue, GuessChecker checker) {
        this.compareValue = compareValue;
        this.checker = checker;
    }

    public void runLoop(Scanner userInput) {

        while (compareValue != 0) {

            MakeGuess nextGuesser = new MakeGuess(compareValue);
            int nextGuess = nextGuesser.findGuess(userInput);
            checker.updateGuess(nextGuess);
            compareValue = checker.compareNumberToGuess();
        }
    }
}
