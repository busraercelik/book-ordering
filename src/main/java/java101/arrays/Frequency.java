package java101.arrays;


public class Frequency {

    static void countFrequency(int[] arr) {
        boolean[] isVisited = new boolean[arr.length];

        for (int i=0; i< arr.length; i++) {
            if (isVisited[i])
                continue;

            int counter = 1;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] == arr[i]) {
                    isVisited[j] = true;
                    counter++;
                }
            }

            System.out.println("Number " + arr[i] + " repeated " + counter + " times");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFrequency(arr);
    }
}
