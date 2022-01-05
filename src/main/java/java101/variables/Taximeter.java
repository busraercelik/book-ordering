package java101.variables;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double traveledDistanceInKM;
        double totalAmount = 10;
        float perKMPrice = 2.2F;
        int taximeterOpeningFee = 10;
        int minAmountToBePaid = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Traveled Distance");
        traveledDistanceInKM = scanner.nextDouble();
        totalAmount = taximeterOpeningFee + (perKMPrice * traveledDistanceInKM);

        totalAmount = (totalAmount < 20) ? 20 : totalAmount;
        System.out.println("Total Amount is " + Math.round(totalAmount) + " TL");

    }
}
