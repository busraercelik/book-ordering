package java101.loops;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int input;
        int counter = 1;
        int maxNum = 0;
        int minNum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many inputs will you enter? ");
        input = scan.nextInt();

        while (counter <= input) {
            System.out.print("Num " + counter + " :");
            int numInput = scan.nextInt();

            if (numInput > maxNum) {
                maxNum = numInput;
            }

            if (minNum == 0 || numInput < minNum) {
                minNum = numInput;
            }
            counter++;
        }

        System.out.println("Max number: " + maxNum + "\nMin number: " + minNum);
    }
}
