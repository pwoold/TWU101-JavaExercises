package com.thoughtworks.tw101.exercises.exercise8;
import com.thoughtworks.tw101.exercises.exercise7.GuessChecker;
import com.thoughtworks.tw101.exercises.exercise7.MakeGuess;

import java.util.Scanner;

public class NewPlayLoop {

    private int compareValue;
    private GuessChecker checker;
    private GuessRecorder recorder;

    public NewPlayLoop(int compareValue, GuessChecker checker, GuessRecorder recorder) {
        this.compareValue = compareValue;
        this.checker = checker;
        this.recorder = recorder;
    }

    public void runLoop(Scanner userInput) {

        while (compareValue != 0) {

            MakeGuess nextGuesser = new MakeGuess(compareValue);
            int nextGuess = nextGuesser.findGuess(userInput);
            recorder.addGuess(nextGuess);
            checker.updateGuess(nextGuess);
            compareValue = checker.compareNumberToGuess();
        }
    }
}
