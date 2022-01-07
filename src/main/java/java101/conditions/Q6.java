package java101.conditions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int month;
        int day;
        String horoscope = "";
        boolean hasError = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("The month you were born :");
        month = scan.nextInt();
        System.out.println("The day you were born :");
        day = scan.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31)
                horoscope = (day <= 21) ? "Capricorn" : "Aquarius";
            else
                hasError = true;
        } else if (month == 2) {
            if (day >= 1 && day <= 29)
                horoscope = (day <= 19) ? "Aquarius" : "Pisces";
            else
                hasError = true;
        } else if (month == 3){
            if (day >= 1 && day <= 31)
                horoscope = (day <= 20) ? "Pisces" : "Aries";
            else
                hasError = true;
        } else if (month == 4) {
            if (day >= 1 && day <= 30)
                horoscope = (day <= 20) ? "Aries" : "Taurus";
            else
                hasError = true;;
        } else if (month == 5) {
            if (day >= 1 && day <= 31)
                horoscope =  (day <= 21) ? "Taurus" : "Gemini";
            else
                hasError = true;
        } else if (month == 6) {
            if (day >= 1 && day <= 30)
                horoscope = (day <= 22) ? "Gemini" : "Cancer";
            else
                hasError = true;
        } else if (month == 7) {
            if (day >= 1 && day <= 30)
                horoscope = (day <= 22) ? "Cancer" : "Leo";
            else
                hasError = true;
        } else if (month == 8) {
            if (day >= 1 && day <= 31)
                horoscope = (day <= 22) ? "Leo" : "Virgo";
            else
                hasError = true;
        } else if (month == 9) {
            if (day >= 1 && day <= 30)
                horoscope = (day <= 22) ? "Virgo" : "Libra";
            else
                hasError = true;
        } else if (month == 10) {
            if (day >= 1 && day <= 31)
                horoscope = (day <= 22) ? "Libra" : "Scorpio";
            else
                hasError = true;
        } else if (month == 11) {
            if (day >= 1 && day <= 30)
                horoscope = (day <= 21) ? "Scorpio" : "Sagittarius";
            else
                hasError = true;
        } else if (month == 12) {
            if (day >= 1 && day <= 31)
                horoscope = (day <= 21) ? "Sagittarius" : "Capricorn";
            else
                hasError = true;
        } else {
            System.out.println("You have given wrong month");
        }
        System.out.println(horoscope);
        System.out.println((hasError) ? "You have given wrong day" : "");
    }


}
