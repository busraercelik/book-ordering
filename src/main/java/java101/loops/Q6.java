package java101.loops;

import java.util.Scanner;

/**
 * Armstrong number
 * 407 ----> (4^3) + (0^3) + (7^3) = 64+0+343 = 407
 * 1342
 * 1634
 *
 * //      find the number of Digits in a number
 * //      2345 / 10 = 245
 * //      234 / 10 = 23
 * //      23 / 10 = 2
 * //      2 / 10 = 0
 */
public class Q6 {
    public static void main(String[] args) {
        int num;
        int tempNum;
        int noOfDigits = 0;
        int counter = 0;
        int lastDigit;
        int exponentiation;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();
        tempNum = num;

//       find the number of digits of given number
        while (tempNum != 0) {
            tempNum /= 10;
            noOfDigits++;
        }

//        find the last digit and take the exponent of each last digit (exponent is no of digits here)
//        sum up each exponentiation and if it is Armstrong no, sum and given number must be the same.
        tempNum = num;
        while (counter < noOfDigits) {
            lastDigit = tempNum % 10;
            tempNum /= 10;

            exponentiation = 1;
            for (int i = 0; i < noOfDigits; i++) {
                exponentiation *= lastDigit;
            }
            sum += exponentiation;

            System.out.println("===================");
            System.out.println("last number: " + lastDigit);
            System.out.println("exponential number: " + exponentiation);
            System.out.println("Summary: " + sum);
            counter++;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number :)");
        }
    }
}
