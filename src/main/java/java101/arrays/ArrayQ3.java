package java101.arrays;


/***
 * 0,0	0,1	0,2	0,3
 * 1,0			1,3
 * 2,0			2,3
 * 3,0			3,3
 * 4,0	4,1	4,2	4,3
 * 5,0			5,3
 * 6,0			6,3
 * 7,0	7,1	7,2	7,3
 */

/**
 * i=0, 4, 7
 * j=0, 3
 */
public class ArrayQ3 {
    public static void main(String[] args) {
        String[][] letterB = new String[8][4];

        for (int i=0; i< letterB.length; i++) {
            for (int j=0; j< letterB[i].length; j++) {
                if (j == 0 || j == 3) {
                    letterB[i][j] = " * ";
                } else if (i == 0 || i == 4 || i == 7) {
                    letterB[i][j] = " * ";
                } else{
                    letterB[i][j] = "   ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
