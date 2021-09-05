package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int numberComputerPicked;
    int max;
    Scanner scan = new Scanner(System.in);

     public GuessTheNumber () {
        Random ran = new Random();
        max = 100;
        numberComputerPicked = Math.abs(ran.nextInt()) % ( 100 + 1 );
    }

    public void play () {
         while (true) {
             int move = scan.nextInt();
             if (move < numberComputerPicked) {
                 System.out.println("Your number is smaller than the Right number! Try again!");
             } else {
                 if (move > numberComputerPicked) {
                     System.out.println (" Your guess is larger than the Right number!");
                 } else {
                     System.out.println ( "You've guessed the Right Number");
                     break;
                 }
             }
         }
    }

    public static void main(String[] args) {
         GuessTheNumber gameOne = new GuessTheNumber();

        System.out.println("Welcome to the game, your mission is to find out a number that we've picked as quick as you can.");
        System.out.println("Our number is from one to " + gameOne.max);
        gameOne.play();
     }
}
