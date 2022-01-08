package java101.conditions;

import java.util.Calendar;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int birthYear;
        int modulusOfBday;
        int currentYear;
        String chineseZodiac = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        birthYear = scan.nextInt();
        modulusOfBday = birthYear % 12;
        currentYear = Calendar.getInstance().get(Calendar.YEAR); // 2022

        assert (birthYear > 1850 && birthYear <= currentYear);

        switch (modulusOfBday) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Mouse";
                break;
            case 5:
                chineseZodiac = "Bull";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Sheep";
                break;
            default:
                System.out.println("You have entered wrong year");
        }

        System.out.println("Your chinese zodiac is " + chineseZodiac);



    }
}
