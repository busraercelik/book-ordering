package java101.loops;

import java.util.Scanner;

/**
 * make diamonds with stars using loops
 *
 * Enter a num:
 * 6
 *                    *
 *                 *  *  *
 *              *  *  *  *  *
 *           *  *  *  *  *  *  *
 *        *  *  *  *  *  *  *  *  *
 *     *  *  *  *  *  *  *  *  *  *  *
 *        *  *  *  *  *  *  *  *  *
 *           *  *  *  *  *  *  *
 *              *  *  *  *  *
 *                 *  *  *
 *                    *
 */
public class Q8 {
    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scan.nextInt();

        String star = " * ";
        for (int i=0; i<num; i++) {
            // i=0, j<1 --> 1
            // i=1, j<3 --> 3
            // i=2, j<5 --> 5
            // i=3,  j<7 --> 7
            for (int k= 0; k< (num - i); k++) {
                System.out.print("   ");
            }
            for (int j=0; j< (i*2) + 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        // num = 6 -1 = 5, i=5
        for (int i=num-1; i>0; i--) {
            // i=5, l=1
            for (int l=(num-i +1); l > 0; l--) {
                System.out.print("   ");
            }
            // m=9
            for (int m= (i*2) -1; m>0; m--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
