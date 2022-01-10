package java101.loops;

import java.util.Scanner;

/**
 * 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 * | num1 | num2 | num3 |
 * | ---- | ---- | ---- |
 * | 0    | 1    | 1    |
 * | 1    | 1    | 2    |
 * | 1    | 2    | 3    |
 * | 2    | 3    | 5    |
  */

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scan.nextInt();
        System.out.print(num1 + "\t" + num2 + "\t");


        for(int i= 0; i < num -2 ; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(num3 + "\t");
        }
    }
}
