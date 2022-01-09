package java101.loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String name;
        String pass;
        String option;
        int balance = 2000;
        int tryCounter = 3;

        Scanner scan = new Scanner(System.in);

        // Login
        while (tryCounter > 0) {
            System.out.print("Enter your username: ");
            name = scan.nextLine();
            System.out.print("Enter your password: ");
            pass = scan.nextLine();

            if (name.equals("patika") && pass.equals("123")) {
                System.out.println("Logged in successfully");
                System.out.println("Welcome back, " + name);

                do {
                    System.out.print("1- Deposit money\n" +
                            "2- Withdraw money\n" +
                            "3- Balance inquiry\n" +
                            "4- Exit\n" +
                            "Please select the option you want to do: ");
                    option = scan.next();

                    switch (option) {
                        case "1":
                            System.out.print("Amount of money : ");
                            int cash = scan.nextInt();
                            balance += cash;
                            break;
                        case "2":
                            System.out.print("Amount of money : ");
                            cash = scan.nextInt();
                            if (balance < cash) {
                                System.out.println("insufficient balance!");
                            } else {
                                balance -= cash;
                            }
                            break;
                        case "3":
                            System.out.println("Your balance: " + balance);
                            break;
                        default:
                            System.out.println("You have entered wrong number !");
                    }
                }while (!option.equals("4")) ;

                System.out.println("See you again <3");
                break;}
            else {
                --tryCounter;
                System.out.println("User name or password is incorrect");
                System.out.println((tryCounter == 0) ?
                        "Your card is blocked, contact with bank people" :
                        "You have left " + tryCounter +" try.");
                System.out.println("==================");
            }
        }
    }
}
