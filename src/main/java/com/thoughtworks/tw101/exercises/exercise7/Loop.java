package com.thoughtworks.tw101.exercises.exercise7;

public class Loop {

    int compareValue;
    GuessChecker checker;

    public Loop(int compareValue, GuessChecker checker) {
        this.compareValue = compareValue;
        this.checker = checker;
    }

    public void runLoop() {

        while (compareValue != 0) {

            MakeGuess nextGuesser = new MakeGuess(compareValue);
            int nextGuess = nextGuesser.promptUser();
            checker.updateGuess(nextGuess);
            compareValue = checker.compareNumberToGuess();
        }
    }
}
