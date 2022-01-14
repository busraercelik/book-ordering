package java101.arrays;

import java.util.Arrays;

/**
 * Insertion Sort
 */
public class Arrangement2 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        // loop from second element of the array to last element
        for (int i=1; i<arr.length; i++) {
            int j = i-1;
            int key = arr[i];

            // if there is bigger value than key in lef sub-array then move the bigger value one position ahead
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            System.out.println("key swapped " + Arrays.toString(arr) + "\tj: " + j);
            // place the key value in sorted part (swapping)
            arr[j+1]=key;
            System.out.println("last " + Arrays.toString(arr));
        }
    }
}
