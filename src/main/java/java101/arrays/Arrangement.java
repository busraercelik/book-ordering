package java101.arrays;

import java.util.Scanner;

/**
 * Selection Sort = The algorithm maintains two sub arrays in a given array.
 * Time Complexity = 0(n^2)
 */
public class Arrangement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i=0; i<length; i++) {
            System.out.print(i+1 + ". Number: ");
            arr[i] = scanner.nextInt();
        }

        // The subarray which is already sorted
        for (int i=0; i<length; i++) {
            // Remaining subarray which is unsorted
            for (int j=i+1; j<length;j++) {
                // System.out.println(arr[i] + "\t" + arr[j]);
                // min element is picked and moved to sorted subarray
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num: arr) {
            System.out.print(num + "\t");
        }
    }
}
