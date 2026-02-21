// Jason Morgan
// 2-2-2026
// Computer Science II Module 2 Assignment 2

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {

    // variables to store the average, number of scores, and current score
    private double ave;
    private int count;
    private int score;

    // default constructor
    public Tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }

    // returns the average
    public double getAve() {
        return ave;
    }

    // returns how many scores were entered
    public int getCount() {
        return count;
    }

    // returns the most recent score
    public int getScore() {
        return score;
    }

    // sets the score
    public void setScore(int newScore) {
        score = newScore;
    }

    // asks the user for scores and calculates the average
    public void getAverage() {

        Scanner input = new Scanner(System.in);

        double sum = 0;   // keeps track of total points
        count = 0;        // keeps track of how many scores were entered

        System.out.print("Enter a test score (-1 to quit): ");
        score = input.nextInt();  // first score before loop

        while (score != -1) {

            sum += score;  // add score to total
            count++;       // increase score count

            System.out.print("Enter a test score (-1 to quit): ");
            score = input.nextInt();
        }

        // this will be NaN if no scores were entered
        ave = sum / count;
    }

    // formats and displays the result
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        return "The average of the " + count +
               " scores entered is " + df.format(ave) + ".";
    }
}