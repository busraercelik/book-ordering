package java101.arrays;

import java.util.Arrays;

/**
 * Write a program that specifies repeating even numbers in an array of numbers
 */
public class ArrayQ4 {

    static boolean isAlreadyFound(int[] arr, int num) {
        for (int numInArr: arr) {
            if (numInArr == num) {
                return true;
            }
        }
        return false;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int[] listOfNums = {4, 3, 7, 3, 3, 2, 9, 4, 10, 21, 1, 4, 33, 9, 1, 2, 2};
        int[] repetitiveNums = new int[listOfNums.length];
        int indexOfRepetitiveNums = 0;

        for (int i=0; i< listOfNums.length; i++)  {
            for (int j=i+1; j< listOfNums.length; j++) {
                // check if no is even before checking equality with subarray
                if (isEven(listOfNums[i]) && listOfNums[i] == listOfNums[j]) {
                    if (!isAlreadyFound(repetitiveNums, listOfNums[i])) {
                        repetitiveNums[indexOfRepetitiveNums++] = listOfNums[i];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(repetitiveNums));
    }
}
