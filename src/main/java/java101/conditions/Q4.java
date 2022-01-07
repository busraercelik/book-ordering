package java101.conditions;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        temp = scan.nextInt();

        if (temp < 5) System.out.println("You can ski");
        else if (temp <= 15) System.out.println("You can go to cinema");
        else if (temp <= 25) System.out.println("You can go to picnic");
        else System.out.println("You can swim");
    }
}
