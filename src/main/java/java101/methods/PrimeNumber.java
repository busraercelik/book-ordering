package java101.methods;

import java.util.Scanner;

public class PrimeNumber {

    static int counter = 2;
    static boolean findPrimeNumber(int num) {

        // corner case
        if (num == 1 || num == 0) {
            return false;
        }

        if (num == counter) {
            return true;
        }

        // base case
        if (num % counter == 0) {
            return false;
        }
        counter++;

        return findPrimeNumber(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();
        if (findPrimeNumber(i)) {
            System.out.println(i + " is a prime number");
        } else {
            System.out.println(i + " is not a prime number");
        }
    }
}
