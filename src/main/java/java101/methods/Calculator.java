package java101.methods;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    static void add(int num1, int num2) {
        System.out.println("Total : " + (num1 + num2));
    }

    static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You cannot divide num by zero!");
            return 0;
        }
        int result = num1 / num2;
        System.out.println(result);

        return  result;
    }

    static void getExponential(int num, int power) {
        int total = 1;
        for (int i = 1; i<= power; i++) {
            total *= num;
        }
        System.out.println(total);
    }

    static void getModulus(int num1, int num2) {
        int result = num1 % num2;
        System.out.println(result);
    }

    static int getFactorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }

    static void calcAreaAndPerimeterOfRectangle(int a, int b) {
        System.out.print("Area of rectangle: ");
        multiply(a, b);
        System.out.println("Perimeter of rectangle: " + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Exit";

        System.out.println(menu);

       while (true) {
           System.out.print("\nSelect an operation : ");
           selection = scanner.nextInt();

           if (!Pattern.matches("[0-7]", Integer.toString(selection))) {
             break;
           }

           if (selection == 0) {
               break;
           }

           System.out.print("Enter a number: ");
           int num1 = scanner.nextInt();
           int num2 = 0;
           if (selection != 7) {
               System.out.print("Enter another number: ");
               num2 = scanner.nextInt();
           }

           switch (selection) {
               case 1:
                   add(num1, num2);
                   break;
               case 2:
                   subtract(num1, num2);
                   break;
               case 3:
                   multiply(num1, num2);
                   break;
               case 4:
                   divide(num1, num2);
                   break;
               case 5:
                   getExponential(num1, num2);
                   break;
               case 6:
                   getModulus(num1, num2);
                   break;
               case 7:
                   System.out.println(getFactorial(num1));
                   break;
               case 8:
                   calcAreaAndPerimeterOfRectangle(num1, num2);
                   break;
               default:
                   System.out.println("Invalid option");
           }
       }


    }
}
