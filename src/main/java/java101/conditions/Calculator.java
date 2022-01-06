package java101.conditions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1, num2, selectedOperation;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();

        System.out.println("Please select one: \n1-Addition \n2-Subtraction \n3-Multiplication \n4-Division");
        selectedOperation = scan.nextInt();

        switch (selectedOperation){
            case 1:
                System.out.println("Addition : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("You cannot divide by 0!");
                    break;
                }
                System.out.println("Division: " + (num1 / num2));
                break;
            default:
                System.out.println("Enter the number within range!");
        }
    }
}
