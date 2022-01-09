package java101.loops;

/**
 * find the three digit armstrong nums
 */
public class Q6_2 {
    public static void main(String[] args) {

        int noOfDigits = 1;
        int lastDigit;
        int num;
        int tempNum;
        int exponential = 1;
        int sum = 0;

        for (num=1; num<=999; num++) {
            if (num < 10) noOfDigits = 1;
            else if (num < 100) noOfDigits = 2;
            else noOfDigits = 3;

            sum = 0;
            tempNum = num;

            for (int i=0; i< noOfDigits; i++) {
                lastDigit = tempNum % 10; // 0
                tempNum /= 10; // 10

                exponential = 1;
                for (int j=1 ; j <= noOfDigits; j++) {
                    exponential *= lastDigit; // 3^3
                }
                sum += exponential;
                /*System.out.println("===================");
                System.out.println("last number: " + lastDigit);
                System.out.println("exponential number: " + exponential);
                System.out.println("Summary: " + sum);*/
            }
            if (num == sum && noOfDigits == 3) {
                System.out.println(num + " is an armstrong number");
            }
        }
    }
}
