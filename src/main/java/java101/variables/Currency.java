package java101.variables;

import java.util.Scanner;

/**
 * @author Busra E.
 */
public class Currency {
    /**
     * recalculates money amount for given VAT
     */
    public static void main(String[] args) {
        double moneyAmount, vatAmount, vatRate=0, vatAddedMoney;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter money amount: ");
        moneyAmount = scan.nextDouble();

        if(moneyAmount > 0 && moneyAmount < 1000) {
            vatRate = 0.18;
        } else if(moneyAmount > 1000) {
            vatRate = 0.08;
        } else {
            System.out.println("You dont have enough money");
        }

        vatAmount = moneyAmount * vatRate;
        vatAddedMoney = moneyAmount + vatAmount;

        System.out.printf("VAT is: %.2f ", vatAmount);
        System.out.printf("\nMoney is : %.2f TL", vatAddedMoney);

    }
}
