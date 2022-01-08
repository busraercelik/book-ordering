package java101.loops;

import java.util.Scanner;

/**
 *  4^0 = 1
 *  4^1 = 4
 *  4^2 = 16 (= 4 * 4)
 *  4^3 = 64 (= 4 * 16)
 *  ...
 */
public class Q3 {
    public static void main(String[] args) {
        int num;
        boolean isValid = true;
        StringBuilder multiplesOf4 = new StringBuilder();
        StringBuilder multiplesOf5 = new StringBuilder();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();

        if (num < 1) {
            System.out.println("Invalid value");
            isValid = false;
        }

        if (isValid) {
            for (int i=1; i<=num; i*=4) {
                multiplesOf4.append(i).append(" ,");
            }

            for (int i=1; i<=num; i*=5) {
                multiplesOf5.append(i).append(" ,");
            }

            System.out.println("Multiples of 4 : " + multiplesOf4);
            System.out.println("Multiples of 5 : " + multiplesOf5);
        }

    }
}
