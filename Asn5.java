//Jason Morgan
//04/06/2026
//Assignment 5

import java.util.ArrayList; // import ArrayList class

public class Asn5 {
    public static void main(String[] args) {

        // create an ArrayList for Strings (fruits)
        ArrayList<String> fruits = new ArrayList<>();

        // add 4 items to the fruits list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // create an ArrayList for Integers (numbers)
        ArrayList<Integer> numbers = new ArrayList<>();

        // add 4 numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // display fruits using a for-each loop
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit); // print each fruit
        }

        // display numbers using a for-each loop
        System.out.println("\nNumbers:");
        for (int num : numbers) {
            System.out.println(num); // print each number
        }

        // ----- extra methods -----

        // remove "Banana" from fruits list
        fruits.remove("Banana");

        // remove the element at index 2 (which is 30)
        numbers.remove(2);

        // print the size of each list
        System.out.println("\nFruits size: " + fruits.size());
        System.out.println("Numbers size: " + numbers.size());

        // display fruits again after changes
        System.out.println("\nUpdated Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // display numbers again after changes
        System.out.println("\nUpdated Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}