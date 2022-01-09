package java101.loops;

import java.util.Scanner;

/**
 * Greatest common divisor
 * gcd(54,24) = 6
 * Solution: Euclid's algorithm
  */

public class GCD {
    public static void main(String[] args) {
        int num1 ;
        int num2 ;
        int minNo;
        int gcd = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        num1 = scan.nextInt();
        System.out.print("Enter a num: ");
        num2 = scan.nextInt();

        // Find the greatest common divisor - Solution 1
        minNo = Math.min(num1, num2);
        while (minNo >= 1) {
            if (num1 % minNo == 0 && num2 % minNo == 0) {
                gcd = minNo;
                break;
            }
            minNo--;
        }
        System.out.println("==============\n" + "Greatest common divisor: " + gcd);


        // Find the greatest common divisor - Solution 2
        minNo = Math.min(num1, num2);
        int counter = 1;
        while (counter <= minNo) {
            if (counter % num1 == 0 && counter % num2 == 0) {
                gcd = counter;
            }
            counter++;
        }
        System.out.println("==============\n" + "Greatest common divisor: " + gcd);

        // Find the least common multiple - Solution 1
        int leastCommonMultiple = 1;
        while (leastCommonMultiple <= (num1 * num2)) {
            if (leastCommonMultiple % num1 == 0 && leastCommonMultiple % num2 == 0) {
                System.out.println("==============\n" + "Least common multiple: " + leastCommonMultiple);
                break;
            }
            leastCommonMultiple++;
        }

        // Find the least common multiple - Solution 2
        System.out.println("==============\n" + "Least common multiple: " + ((num1 * num2) / gcd));

    }

}
