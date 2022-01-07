package java101.conditions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int maths;
        int physics;
        int turkish;
        int chemistry;
        int music;
        int totalOfGrades = 0;
        int counter = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("maths score: ");
        maths = scan.nextInt();

        System.out.println("physics score: ");
        physics = scan.nextInt();

        System.out.println("turkish score: ");
        turkish = scan.nextInt();

        System.out.println("chemistry score: ");
        chemistry = scan.nextInt();

        System.out.println("music score: ");
        music = scan.nextInt();
/**
 *  grades must be between 0 and 100
 *  if not then do not include the grade in average
 */
        if((maths >= 0 && maths <= 100)) {
            totalOfGrades += maths;
            counter++;
        }

        if((physics >= 0 && physics <= 100)) {
            totalOfGrades += physics;
            counter++;
        }

        if((turkish >= 0 && turkish <= 100)) {
            totalOfGrades += turkish;
            counter++;
        }

        if((chemistry >= 0 && chemistry <= 100)) {
            totalOfGrades += chemistry;
            counter++;
        }

        if((music >= 0 && music <= 100)) {
            totalOfGrades += music;
            counter++;
        }

        if (counter == 0) {
            System.out.println("You cannot calculate average of your grades");
        } else {
            int avg = totalOfGrades / counter;

            System.out.println((avg <= 55) ? "Failed :( " : "Passed :)");
            System.out.println("grade average: " + avg);
            System.out.println("number of lessons: " + counter);
        }

    }

}
