package java101.methods;

import java.util.Scanner;

public class PalindromeNumber {

    static void checkIfPalindrome(int num) {
        int reversedNumber = 0;
        int lastNumber = 0;

        // 123
        for(int tempNum = num; tempNum > 0; tempNum /= 10) {
            lastNumber = tempNum % 10; //3
            reversedNumber = (reversedNumber * 10) + lastNumber; //3
        }

        System.out.println((num == reversedNumber) ? (num + " is a Palindrome number") : (num + " is not a Palindrome number"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  num: ");
        int num = scanner.nextInt();

        checkIfPalindrome(num);
    }


}
