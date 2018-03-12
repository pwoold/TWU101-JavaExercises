package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        topHalf(n);
        middle(n);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        topHalf(n);
        middle(n);
        bottomHalf(n);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        topHalf(n);
        middleName();
        bottomHalf(n);
    }

    private static String returnLine(int s, int a){
        if (s == 0){
            return String.format("%0" + a + "d", 0).replace("0","*");
        }
        return String.format("%0" + s + "d", 0).replace("0"," ") + String.format("%0" + a + "d", 0).replace("0","*");
    }

    private static void topHalf(int n){
        for(int i=0; i<n-1; i++){
            System.out.println(returnLine((n-1)-i,i*2+1));
        }
    }

    private static void middle(int n){
        System.out.println(returnLine(0,n*2-1));
    }

    private static void middleName(){
        System.out.println("Phoebe");
    }

    private static void bottomHalf(int n){
        for(int i=n-1; i>0; i--){
            System.out.println(returnLine(n-i, i*2-1));
        }
    }
}
