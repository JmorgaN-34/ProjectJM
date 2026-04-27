//Jason Morgan
//04/27/2026
//Module 8 Assignment 1

import java.io.*;
import java.text.DecimalFormat;

public class M8A1 {

    public static void main(String[] args) {

        // input file and output file
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            // skip the first line because it's the headings
            reader.readLine();

            // write headings to the new file
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            DecimalFormat money = new DecimalFormat("$0.00");

            // keep reading until there are no more lines
            while((line = reader.readLine()) != null) {

                // split each line by commas
                String[] data = line.split(",");

                // turn strings into numbers
                int empID = Integer.parseInt(data[0]);
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                double weeklyPay;

                // check if employee worked overtime
                if(hoursWorked > 40) {
                    double overtimeHours = hoursWorked - 40;

                    // regular pay + overtime pay
                    weeklyPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
                }
                else {
                    // normal pay if no overtime
                    weeklyPay = hoursWorked * payRate;
                }

                // write everything to output file
                writer.write(empID + "," +
                             payRate + "," +
                             hoursWorked + "," +
                             money.format(weeklyPay));
                writer.newLine();
            }

            // close files
            reader.close();
            writer.close();

            System.out.println("output.csv created successfully.");

        } catch(IOException e) {
            // print error if something goes wrong
            System.out.println("Error: " + e.getMessage());
        }
    }
}