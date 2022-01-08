package java101.conditions;

import java.util.Scanner;

/**
 *  Leap Year
 */
public class Q10 {
    public static void main(String[] args) {
       int year;
       String message = "";

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = scan.nextInt();

        if ((year % 100 == 0)) {
            if ((year % 400 != 0)) {
                message =  year + " is not a leap year";
            } else {
                message =  year + " is a leap year";
            }
        } else if (year % 4 == 0) {
            message =  year + " is a leap year";
        }

        System.out.println(message);
    }
}
