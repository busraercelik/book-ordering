package java101.methods;

/**
 * 0 1 1 2 3 5 8 13 21 34 55
 * f(1) = 1
 * f(2) = 1
 * f(3) = f(2) + f(1)
 * f(4) = f(3) + f(2)
 * f(5) = f(4) + f(3)
 * f(n) = f(n-1) + f(n-2)
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonacci(5));
    }

    static int findFibonacci(int num) {
        if (num == 1 || num == 2) {
            System.out.println("Inside if statement, num : " + num);
            return 1;
        }
        System.out.println("num =>" + num);
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
}
