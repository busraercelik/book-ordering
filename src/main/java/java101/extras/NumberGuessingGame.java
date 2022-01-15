package java101.extras;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static final int MAX_TRY_COUNT = 5;

    public static void main(String[] args) {
        Random random = new Random();
        int randomNo = random.nextInt(100);
        int[] wrongTries = new int[5];
        boolean isWrong = false;
        boolean hasWon = false;
        System.out.println(randomNo);

        Scanner sc = new Scanner(System.in);
        int input;
        int tryCount = 0;

        while (tryCount < MAX_TRY_COUNT) {
            System.out.print("Enter your guess num: ");
            input = sc.nextInt();

            if (input < 0 || input > 100) {
                System.out.println("Wrong Number!Enter a number between 0 and 100!");
                if (isWrong){
                    System.out.println("You made too many incorrect entries. Remaining right is "
                            + (MAX_TRY_COUNT - ++tryCount));
                } else {
                    isWrong = true;
                    System.out.println("The next time you make a mistake, your right to try will be deducted.");
                }
                continue;
            }

            if (input == randomNo) {
                System.out.println("Correct! The secret number is " + randomNo);
                hasWon = true;
                break;
            } else {
                wrongTries[tryCount++] = input;
                System.out.println("You entered a wrong number!\tRemaining right is " + (MAX_TRY_COUNT - tryCount));
                System.out.println((input > randomNo) && (!isWrong) ?
                        input + " is greater than secret number" :
                        input + " is less than secret number");
            }
        }
        if (!hasWon) {
            System.out.println("=====================\nYou have lost =(");
            if (!isWrong) {
                System.out.println("Your guesses are : " + Arrays.toString(wrongTries) +"\nSecret number was " + randomNo);
            }
        }
    }
}
