package java101.loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scan.nextInt();

        for (int i=1 ; i< num; i++) {
            if (num % i == 0) {
               sum += i;
            }
        }

        System.out.println((sum == num) ? (num + " is a perfect number.") : (num + " is not a perfect number."));

    }
}
