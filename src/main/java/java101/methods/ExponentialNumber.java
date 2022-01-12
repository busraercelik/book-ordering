package java101.methods;

import java.util.Scanner;

public class ExponentialNumber {

    /**
     *  f(2, 3) = 2 * f(2, 2) = 2 * 2 * f(2,1) = 2 * 2 * 2 * f(2,0) = 8
     *  f(2, 0) = 1
     * */
    static int findExponential(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * findExponential(num, (pow -1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        System.out.print("Enter power of num: ");
        int pow = scanner.nextInt();

        System.out.println(findExponential(num, pow));
    }
}
