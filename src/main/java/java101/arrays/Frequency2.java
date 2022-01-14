package java101.arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequency2 {

    static void countFreq(int[] arr) {
        Map<Integer,Integer> integerMap = new HashMap<>();

        for (int num : arr) {
            integerMap.computeIfPresent(num, ((key, val) -> val+1));
            integerMap.computeIfAbsent(num, val -> 1);
        }

        for (Map.Entry<Integer,Integer> entry : integerMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " repeated " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFreq(arr);
    }
}
