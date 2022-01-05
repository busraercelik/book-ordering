package java101.variables;

import java.util.Scanner;

public class Body {
    /**
     * calculated body mass index by this formula: kg / m*m
     * @param args
     */
    public static void main(String[] args) {
        float weight;
        float height;
        double bodyMassIndex;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        weight = scanner.nextFloat();
        System.out.println("Enter height in cm");
        height = scanner.nextFloat();
        bodyMassIndex = weight / Math.pow(height*0.01,2);
        System.out.println("Body Mass Index is "+ Math.round(bodyMassIndex));
    }
}

