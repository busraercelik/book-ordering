package java101.graduation_project;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Minefield {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    private static final String MINE_PATTERN = " * ";
    private static final String FILLING_PATTERN  = " - ";
    int noOfFilledPoints = 0;

    void run() {
        System.out.print("Number of rows: ");
        int noOfRows = sc.nextInt();
        System.out.print("Number of columns: ");
        int noOfColumns = sc.nextInt();

        String[][] mines = getMines(noOfRows, noOfColumns);
        printMindField(mines);
        String[][] mineField = createMineField(noOfRows, noOfColumns);
        printMindField(mineField);
        checkEnteredRowAndCol(noOfRows, noOfColumns, mines, mineField);
    }

    String[][] getMines(int row, int column) {
        String[][] mineArr = new String[row][column];

        int noOfMines = (row * column) / 4;
        System.out.println("Positions of mines: ");

        for (int i=0; i< row; i++) {
            Arrays.fill(mineArr[i], FILLING_PATTERN);
        }

        int count=0;
        while(count <noOfMines) {
            int ranRow = random.nextInt(row);
            int ranCol = random.nextInt(column);

            if (!Objects.equals(mineArr[ranRow][ranCol],MINE_PATTERN)) {
                mineArr[ranRow][ranCol] = MINE_PATTERN;
                count++;
            }
        }
        return mineArr;
    }

    String[][] createMineField(int row, int column) {
        String[][] arr = new String[row][column];
        System.out.println("Welcome to Minefield game !");

        for (int i=0; i< row; i++) {
            Arrays.fill(arr[i], FILLING_PATTERN);
        }
        return arr;
    }

    void printMindField(String[][] arr) {
        for (String[] nums: arr) {
            for (String num: nums) {
                System.out.print(num);
            }
            System.out.println();
        }
    }


    private void checkEnteredRowAndCol(int noOfRows, int noOfColumns, String[][] mines, String[][] mineField) {
        boolean isDead;
        boolean isWin = false;
        System.out.print("Select a row : ");
        int row = sc.nextInt();
        System.out.print("Select a column : ");
        int column = sc.nextInt();

        if (row < 0 || row >= noOfRows || column < 0 || column >= noOfColumns) {
            System.out.println("Invalid coordinate!");
            checkEnteredRowAndCol(noOfRows, noOfColumns, mines, mineField);
        }

        isDead = hasDied(mines, row, column);

        if (!isDead) {
            int outerLoopEnd = (row + 1 < noOfRows) ?  (row + 1) :  row;
            int outerLoopBegin = (row - 1 >= 0) ? (row - 1) : row;
            int innerLoopEnd = (column + 1 < noOfColumns) ? (column + 1) : column;
            int innerLoopBegin = (column - 1 >= 0) ? (column -1) : column;

            int noOfMinesNearby = 0;
            for (int i=outerLoopBegin; i<=outerLoopEnd; i++){
                for (int k=innerLoopBegin; k<=innerLoopEnd;k++) {
                    if (Objects.equals(mines[i][k], MINE_PATTERN)) {
                        noOfMinesNearby++;
                    }
                }
            }
            mineField[row][column] = " " + noOfMinesNearby + " ";
            noOfFilledPoints++;
            printMindField(mineField);

            int noOfMines = (noOfRows * noOfColumns) / 4;
            if (((noOfRows * noOfColumns) - noOfFilledPoints) == noOfMines) {
                isWin = true;
                System.out.println("You won! =] =]");
            }

            if (!isWin) {
                checkEnteredRowAndCol(noOfRows, noOfColumns, mines, mineField);  
            }
            //System.out.println(noOfMinesNearby);
        } else {
            System.out.println("Game over! x_X");
        }
    }

    private boolean hasDied(String[][] mines, int row, int column) {
        for (int i = 0; i< mines.length; i++) {
            for (int k = 0; k< mines[i].length; k++) {
                if (Objects.equals(mines[i][k], MINE_PATTERN) && Objects.equals(i, row) && Objects.equals(k, column)) {
                    return true;
                }
            }
        }
        return false;
    }
}
