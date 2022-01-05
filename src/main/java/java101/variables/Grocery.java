package java101.variables;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        float pear = 2.14F;
        float apple = 3.67F;
        float tomato = 1.11F;
        float banana = 0.95F;
        float eggplant = 3F;
        double totalAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kg of pear do you have? ");
        float pearInKg = scanner.nextFloat();
        System.out.println("How many kg of apple do you have? ");
        float appleInKg = scanner.nextFloat();
        System.out.println("How many kg of tomato do you have? ");
        float tomatoInKg = scanner.nextFloat();
        System.out.println("How many kg of banana do you have? ");
        float bananaInKg = scanner.nextFloat();
        System.out.println("How many kg of eggplant do you have? ");
        float eggplantInKg = scanner.nextFloat();

        totalAmount = pearInKg * pear +
                appleInKg * apple +
                tomatoInKg * tomato +
                bananaInKg * banana +
                eggplantInKg * eggplant;

        System.out.println("Total amount: " + totalAmount);
    }


}
