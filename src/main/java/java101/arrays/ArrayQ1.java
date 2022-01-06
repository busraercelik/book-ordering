package java101.arrays;

public class ArrayQ1 {
    /**
     * find the harmonic average of the given array
     * formula: n (number of elements) / harmonic series of elements
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for( int i=0; i< numbers.length; i++) {
            sum += (1 / numbers[i]);
        }

        System.out.println(numbers.length / sum);
    }
}
