package java101.arrays;

import java.util.Scanner;

public class TwoDimArr {
    public static void main1(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j< matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        int[][] matrix = new int[2][2];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j< matrix[i].length; j++) {
                matrix[i][j] = (int) Math.random();
            }
        }
    }

    public static void main3(String[] args) {
        int[][] matrix = new int[3][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void main4(String[] args) {
        int[][] matrix = new int[3][4];
        int number = 1;
//      rows
        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];
//         columns
            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
    }

    public static void main5(String[] args) {
        int[][] array = {
                {1,2},
                {3,4},
                {5,6}
        };
        for (int i = array.length - 1; i>=0; i--) {
            for (int j = array[i].length - 1 ; j >= 0 ; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        System.out.print(sum);
    }

    /*
    arr[0][0] = 1,
    arr[0][1] = 2,
    arr[0][2] = 3,
    arr[0][3] = 4,

    1 2 3 4
    1 2 3 4
    1 2 3 4

    sum = 0 + 1 = 1
    sum = 3, 6, 10
     */

}
