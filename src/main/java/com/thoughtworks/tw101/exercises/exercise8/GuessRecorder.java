package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class GuessRecorder {

    private ArrayList<Integer> userGuesses = new ArrayList<>();

    public GuessRecorder() {}

    public void addGuess(int newGuess) {
        userGuesses.add(newGuess);
    }

    public void printGuesses() {
        System.out.println("Your Guesses: ");
        for (int guess:userGuesses) {
            System.out.println(guess);
        }
    }

}
