package java101.conditions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double distance;
        int age;
        int tripDirection;
        float chargePerKM = 0.1F;
        double totalAmount;
        boolean isNoCorrect = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in km between cities: ");
        distance = scan.nextDouble();
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        System.out.println("Select trip type (One way flight => 1,  Round trip  => 2): ");
        tripDirection = scan.nextInt();

        if((tripDirection != 1) && (tripDirection != 2) || (distance <= 0) ){
            System.out.println("\"Entered wrong number\"");
            isNoCorrect = false;
        }
        if (isNoCorrect) {
            totalAmount = Math.round(distance * chargePerKM);
            System.out.println("Total amount of one way trip " + totalAmount);

            if (tripDirection == 2) {
                totalAmount *= 2;
                System.out.println("Total amount of round trip without discount " + totalAmount);
                totalAmount -= totalAmount * 0.2;
                System.out.println("Total amount of round trip with discount " + totalAmount);
            }

            if (age < 0) {
                System.out.println("You entered wrong value!");
            } else if (age < 12) {
                totalAmount *= 0.5;
            } else if (age <= 24) {
                totalAmount -= (totalAmount * 0.1);
            } else if (age >= 65) {
                totalAmount -= (totalAmount * 0.3);
            }
            System.out.println("Ticket price is " + totalAmount);
        }

    }


}
