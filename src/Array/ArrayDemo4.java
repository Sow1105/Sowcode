package Array;


public class ArrayDemo4 {
    private static int[] printEvenNumbersInArray(int[] input) {
        int[] output = new int[input.length];
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[counter] = input[i];
                counter++;
            }
        }
        printArray(output);
        return output;
    }

    private static void printArray(int[] output) {
    }
}