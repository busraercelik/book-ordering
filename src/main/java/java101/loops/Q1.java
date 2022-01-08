package java101.loops;

import java.util.Scanner;

/**
 * Write a program that calculates the average of numbers divisible by 3 and 4 from 0 to the number entered with Java loops.
 */
public class Q1 {
    public static void main(String[] args) {
        int num;
        int counter = 0;
        int divisionCounter = 0;
        int sum = 0;
        int avg = 0;
        boolean isGreaterThanZero = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();

        if ((num == 0 ) || (num < 0)) {
            System.out.println("You must enter a number greater than 0");
            isGreaterThanZero = false;
        }

        if (isGreaterThanZero) {
            while(counter <= num) {
                if ((counter % 4 == 0) || (counter % 3 == 0)) {
                    sum += counter;
                    if (counter != 0) {
                        divisionCounter++;
                    }
                }
                counter++;
            }
        }

        if (divisionCounter != 0) {
            avg = sum / divisionCounter;

            System.out.println("Sum = " + sum);
            System.out.println("Division counter= " + divisionCounter);
            System.out.println("Average = " + avg);
        }

    }
}
