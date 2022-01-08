package java101.loops;

import java.util.Scanner;

/**
 * Combination is a grouping of outcomes in which the order does not matter.
 * C(n, r) = n! / ((n – r)! * r!)
 *
 * (n -r)! = (n-r) * (n-r-1) * (n-r-2) *...* 1
 */
public class Q4 {
    public static void main(String[] args) {

        int totalNoOfElements;
        int noOfSelectedObject;
        int combination;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of elements in a set: " );
        totalNoOfElements = scan.nextInt();
        System.out.println("Enter the number of objects you want to select ");
        noOfSelectedObject = scan.nextInt();

        combination = calculateFactorial(totalNoOfElements) /
                (calculateFactorial(totalNoOfElements - noOfSelectedObject) * calculateFactorial(noOfSelectedObject));

        System.out.println(combination);

    }

    public static int calculateFactorial(int num) {
        int factorialOfGivenNum = 1;

        for (int i=1; i <= num; i++) {
            factorialOfGivenNum *= i;
        }

        return factorialOfGivenNum;
    }

    public static int calculateFactorialWithoutLoop(int num) {
        //        n * (n-1) * (n-2) * .. * 1
        if (num == 1) {
            return 1;
        } else {
            // 3 * 2 * 1 = 6
            return num *  calculateFactorialWithoutLoop(num - 1);
        }
    }
}
