//Jason morgan
//Module 5 Assignment 1
//3/29/2026

import java.util.Random;
import java.util.Arrays;

public class IntArray {

    // required fields (DO NOT CHANGE NAMES)
    private int length;
    private int myArray[];

    // constructor
    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    // return size of array
    public int size() {
        return length;
    }

    // fill array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // get value at index
    public int get(int element) {
        return myArray[element];
    }

    // set value at index
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // clear array (set all values to 0)
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArray[i] = 0;
        }
    }

    // check if array is empty (all values are 0)
    public boolean isEmpty() {
        for (int i = 0; i < length; i++) {
            if (myArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // sort array (ascending order) using bubble sort
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    // print array nicely
    public String toString() {
        return Arrays.toString(myArray);
    }
}