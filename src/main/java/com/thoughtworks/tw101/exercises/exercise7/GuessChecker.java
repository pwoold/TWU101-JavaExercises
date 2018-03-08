package com.thoughtworks.tw101.exercises.exercise7;

public class GuessChecker {

    private static final Integer NUMBER_TO_GUESS = (int)(Math.random()*100);
    private Integer userGuess;

    public GuessChecker(int userGuess) {
        this.userGuess = userGuess;
    }

    public int compareNumberToGuess() {
        return NUMBER_TO_GUESS.compareTo(userGuess);
    }

    public void updateGuess(Integer newGuess) {
        this.userGuess = newGuess;
    }
}
