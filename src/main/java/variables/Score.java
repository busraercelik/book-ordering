package variables;

import java.util.Scanner;

public class Score {
    /**
     *
     * if average score is less than 60, student fails
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your maths score: ");
        int mathsScore = scan.nextInt();

        System.out.println("Enter your physics score: ");
        int physicsScore = scan.nextInt();

        System.out.println("Enter your chemistry score: ");
        int chemScore = scan.nextInt();

        System.out.println("Enter your Turkish score: ");
        int turkishScore = scan.nextInt();

        System.out.println("Enter your history score: ");
        int historyScore = scan.nextInt();

        System.out.println("Enter your music score: ");
        int musicScore = scan.nextInt();

        double averageScore = (mathsScore + physicsScore + chemScore + turkishScore + historyScore + musicScore) / 6;
        System.out.println("Your average score is " + averageScore);
        System.out.println(averageScore >= 60 ? "Passed" : "Failed");

    }
}
