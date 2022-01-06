package java101.arrays;

public class ForEachLoop {
    public static void main1(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int[] arr: matris) {
            for(int val: arr) {
                System.out.print(val+ ", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score: scores) {
            System.out.print(score+ " ");
        }
    }
}
