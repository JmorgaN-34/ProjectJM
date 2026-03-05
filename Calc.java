//Jason Morgan
//3/4/2026
//Calulation program 

// Calc class performs basic math operations on two numbers
public class Calc {

    // private variables to store the numbers
    private double num1;
    private double num2;

    // method to set the first number
    public void setNum1(double n1) {
        num1 = n1;
    }

    // method to set the second number
    public void setNum2(double n2) {
        num2 = n2;
    }

    // method to get the first number
    public double getNum1() {
        return num1;
    }

    // method to get the second number
    public double getNum2() {
        return num2;
    }

    // method that returns the sum of the two numbers
    public double add() {
        return num1 + num2;
    }

    // method that returns the difference of the two numbers
    public double subtract() {
        return num1 - num2;
    }

    // method that returns the product of the two numbers
    public double multiply() {
        return num1 * num2;
    }

    // method that returns the quotient of the two numbers
    public double divide() {
        return num1 / num2;
    }

    // toString method used to display the private variables
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}