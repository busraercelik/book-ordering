package java101.loops;

import java.util.Scanner;

/**
 *  Exponential number
 */
public class Q5 {
    public static void main(String[] args) {
        int num;
        int exponent;
        int total = 1;

        // 5^3 = 5 * 5 * 5 (5 to the power 3)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        num = sc.nextInt();
        System.out.println("Enter exponent: ");
        exponent = sc.nextInt();

       for (int i=1; i<exponent; i++) {
           total = total * num ;
       }

        System.out.println(total);
    }
}
