package java101.arrays;

import java.util.Arrays;

public class Recursion {

    static boolean canWin(int[] arr, int leap, int destination) {
        int n = arr.length;
        System.out.println("First Array: " + Arrays.toString(arr));
        System.out.println("i: "+ destination + "\tvalue: " + (destination<n && destination>=0 ? arr[destination] : -1));
        if (destination >= n) {
            return true;
        } else if (destination < 0 || arr[destination] == 1) {
            return false;
        }

        arr[destination] = 1;

        System.out.println("Visited Array: " + Arrays.toString(arr));
        System.out.println("================================");
        return canWin(arr, leap, destination+leap) || canWin(arr, leap, destination+1) || canWin(arr, leap, destination-1);
    }


    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0};
        int leap = 1;

        System.out.println(canWin(arr, leap, 0));
    }
}
