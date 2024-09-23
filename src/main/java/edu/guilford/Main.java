package edu.guilford;
// Maggie Christensen
// September 23, 2024

import java.util.Random;
import java.util.Scanner;
// import the things we need to use!

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        // create a random variable and an input variable to randomly roll the dice
        // and make it possible to provide keyboard input.

        System.out.println("This game rolls a number of dice and calculates their total.");
        // inform the user.

        System.out.print("How many sides do you want them to have? ");
        int sides = scan.nextInt();
        System.out.print("How many dice do you want to roll? ");
        int number = scan.nextInt();
        // let them choose.

        int sum = 0;
        // initializes sum.

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number + 1; i++) {
            int diceRoll = rand.nextInt(1,sides + 1);
            //System.out.println("The sum of " + number + "d" + sides + " = " + sum);
            sum += diceRoll;
        }
        // creates a for loop that generates a random number between 1 and sides (inclusive)
        // and adds this number to sum. parameter is i < number + 1 to make sure it is also inclusive.
        // 0 does not provide anything, and we want a number of rolls rather than a number of
        // rolls - 1 when we include 0.

        System.out.println("The sum of " + number + "d" + sides + " is " + sum);
        // prints the sum.

        scan.close();
        // closes the scanner.
    }
}