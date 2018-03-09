package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.GuessChecker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        GuessRecorder recorder = new GuessRecorder();

        MakeGuessHandleException firstGuesser = new MakeGuessHandleException();
        int userGuess = firstGuesser.findGuess(userInput);
        recorder.addGuess(userGuess);

        GuessChecker checker = new GuessChecker(userGuess);
        int compareValue = checker.compareNumberToGuess();

        NewPlayLoop newLoop = new NewPlayLoop(compareValue, checker, recorder);
        newLoop.runLoop(userInput);

        recorder.printGuesses();

        System.out.println("You got it! The number was " + checker.getNumberToGuess());

        userInput.close();

    }
}
