package java101.methods;

import java.util.Scanner;

public class Pattern {
//    10 5 0 5 10
//    10 10-5 5-5
    static int currentDecNo = 0;
    static int currentIncNo = 0;
    static int enteredNo;

    // 16 11 6 1 -4
    static void decrementPattern(int a) {
        System.out.print(a + "\t");

        if (a <= 0) {
            currentDecNo = a;
        } else {
            decrementPattern(a - 5);
        }

    }

    // -4 1 6 11 16
    static void incrementPattern(int num){
        if (num > 0) {
            System.out.print(num + "\t");
        }
        // base case: recursion will terminate and backtrack when it reaches the bottommost end of the tree
        if (num == enteredNo) {
            currentDecNo = num;
        } else {
            // recursively traverse and process each node
            incrementPattern(num + 5);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        enteredNo = scanner.nextInt();

        decrementPattern(enteredNo);
        incrementPattern(currentDecNo);
    }
}
