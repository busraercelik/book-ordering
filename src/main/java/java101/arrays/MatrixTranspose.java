package java101.arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        display(a, "Matrix: ");

        int row = a.length;
        int column = 3;
        int[][] transposeArr = new int[column][row];

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++){
                transposeArr[j][i] = a[i][j];
            }
        }

        display(transposeArr, "Transpose: ");
    }

    public static void display(int[][] arr, String name) {
        System.out.println(name);
        for (int[] row: arr) {
            for (int column: row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
