package java101.loops;

import java.util.Scanner;

/**
 * 1 + 1/2 + 1/3 + 1/4 + ..
 */
public class Q7 {
    public static void main(String[] args) {

        int num;
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();

        for (int i=1; i<=num; i++) {
            sum = sum +  (1 / (double) i);
        }
        System.out.println(sum);
    }
}
