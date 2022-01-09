package java101.loops;

import java.util.Scanner;

// 1643 = 1 + 6 + 4 + 3 = 14
public class Q6_3 {
    public static void main(String[] args) {
        int num;
        int tempNum;
        int noOfDigits = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();

        tempNum = num;
        while (tempNum != 0) {
            tempNum /= 10;
            noOfDigits++;
        }

        tempNum = num;
        for (int i=0; i< noOfDigits; i++) {
            int lastDigit = tempNum % 10;
            tempNum /= 10;
            sum += lastDigit;
        }

        System.out.println("Total " + sum);
    }
}
