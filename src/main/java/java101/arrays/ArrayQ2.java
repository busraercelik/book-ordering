package java101.arrays;

import java.util.Scanner;

/**
 * Write a program that finds the nearest number smaller than the entered number and
 * the nearest number bigger of the elements in the array
 */
public class ArrayQ2 {
    public static void main(String[] args) {
        int[] nums = {15,12,788,1,-1,-778,2,0};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int selectedNo = scan.nextInt();

        int closestSmallerNo = nums[0];
        int closestBiggerNo = nums[0];
        int diffSmallerNo = closestSmallerNo - selectedNo;
        int diffBiggerNo = closestBiggerNo - selectedNo;
        int diffCurrentNo;

        for (int num: nums) {
            if (num < selectedNo) {
                diffCurrentNo = selectedNo-num;
                if ( diffCurrentNo < diffSmallerNo) {
                    // update number & difference between numbers
                    closestSmallerNo = num;
                    diffSmallerNo = diffCurrentNo;
                }
            } else if (num > selectedNo) {
                diffCurrentNo = num-selectedNo;
                if (diffCurrentNo < diffBiggerNo) {
                    // update number & difference between numbers
                    closestBiggerNo = num;
                    diffBiggerNo = diffCurrentNo;
                }
            }
        }

        System.out.println("\nNearest number less than the entered number "+selectedNo+ " is --> "+ closestSmallerNo);
        System.out.println("Nearest number more than the entered number "+selectedNo+ " is --> "+ closestBiggerNo);
    }
}
