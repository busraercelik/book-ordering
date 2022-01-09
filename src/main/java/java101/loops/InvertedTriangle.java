package java101.loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int num;
        String star = "*";

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        num = scan.nextInt();


        for (int i = num ; i>=1; i--) {
            for (int k = (num - i); k >= 1 ; k--) {
                System.out.print(" ");
            }
            for (int j = (i*2 - 1); j>= 1 ; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
