package java101.conditions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num: ");
        num1 = scan.nextInt();
        System.out.println("Enter second num: ");
        num2 = scan.nextInt();
        System.out.println("Enter third num: ");
        num3 = scan.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.print((num2 < num3) ? ("num1 < num2 < num3") : ("num1 < num3 < num2"));
        } else if ( num2 < num1 && num2 < num3) {
            System.out.print((num3 < num1) ? ("num2 < num3 < num1") : ("num2 < num1 < num3"));
        } else {
            System.out.print((num2 < num1) ? ("num3 < num2 < num1") : ("num3 < num1 < num2"));
        }
    }
}
