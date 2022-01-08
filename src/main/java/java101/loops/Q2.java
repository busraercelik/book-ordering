package java101.loops;

import java.util.Scanner;

/**
 * we write a program that accepts inputs from the user until an odd number is entered and
 * adds the numbers that are even and multiples of 4 from the entered values and prints them on the screen.
 */
public class Q2 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a num: ");
            num = scan.nextInt();

            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);

        System.out.println("Sum = " + sum);
    }
}
