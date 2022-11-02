package Array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 8, -12, 6};
        int[] b = {15, 12, 7, 18, -12, -19, -14};

        getSecMax(a);
        getSecMax(b);
        getSecMin(a);
        getSecMin(b);
    }

    private static void getSecMax(int[] a) {
        int max = a[0];
        int secondMax = max;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println("SecMax value of array is " + secondMax);
    }

    private static void getSecMin(int[] a) {
        int min = Integer.MAX_VALUE;
        int secondMin = min;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {

                secondMin = min;
                min = a[i];
            }
        }
            for (int i = 0; i < a.length; i++) {
                if (a[i] != min && a[i] <= secondMin) {
                    secondMin = a[i];
                }
            }
        System.out.println("SecMin value of array is " + secondMin);

    }
    }

