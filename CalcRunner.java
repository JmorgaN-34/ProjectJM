//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input

import java.util.Scanner;

public class CalcRunner {

    public static void main(String[] args){

        //instantiate a Calc object
        Calc myCalculator = new Calc();

        //get user input for two numbers
        Scanner scan = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;
        boolean valid = false;

        //first number input validation
        while (!valid) {
            System.out.println("Please enter the first number: ");
            if (scan.hasNextDouble()) {
                n1 = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next(); //clear bad input
            }
        }

        valid = false;

        //second number input validation
        while (!valid) {
            System.out.println("Please enter the second number: ");
            if (scan.hasNextDouble()) {
                n2 = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next();
            }
        }

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());

        scan.close();
    }
}