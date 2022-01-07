package java101.conditions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String username, password;
        String newPassword;
        String answer;
        int tryCount = 3;
        int counter = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        username = scan.nextLine();
        System.out.println("Enter your password: ");
        password = scan.nextLine();

        if (username.equals("patika") && password.equals("qwer")) {
            System.out.println("Login Successful");
        } else
            System.out.println("Wrong username or password!");
            System.out.println("Do you want to reset password? Y/N");
            answer = scan.nextLine();

            if (answer.equals("Y")) {
                System.out.println("Enter your new password: ");
                newPassword = scan.nextLine();
                System.out.println((!newPassword.equals("qwer") ? "Password created" :
                        "Could not create password, enter different password"));
                newPassword = scan.nextLine();
                System.out.println((!newPassword.equals("qwer") ? "Password created" :
                        "Could not create password"));
            }

    }
}
