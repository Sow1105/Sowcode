package Array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] a = {5, 2, 6, -8, 3, -50, -3};
        int[] b={-5,-6,-3,-9};
        findMax(a);
        findMax(b);
        findMin(a);
        findMin(b);

    }

    private static void findMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("the longest element in the array is " + max);
    }
    private static void findMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("the Minimum element in the array is " + min);
    }



    }



