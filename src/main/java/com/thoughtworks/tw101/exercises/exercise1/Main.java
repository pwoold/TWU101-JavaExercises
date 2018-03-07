package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        printOddNumbers1To100AndSum();
    }

    private static void printOddNumbers1To100AndSum() {
        int sum = 0;
        for(int i=0; i<100; i++){
            if(i%2==1){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
