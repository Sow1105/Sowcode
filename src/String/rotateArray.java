package String;

public class rotateArray {
    public static void main(String[] args) {
        //Initialize array

        int[] array = new int[]{1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 4;
        //Displays original array
        System.out.println("original array");

        //Rotate the given array by n times toward right
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, last;
            //Stores the last element of array
            last = array[array.length - 1];
            for (j = array.length - 1; j > 0; j--) {
                //Shift element of array by one
                array[j] = array[j - 1];
            }
            //Last element of array will be added to the start of array.
            array[0] = last;
        }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after rotation");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
