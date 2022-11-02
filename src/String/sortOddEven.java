package String;

public class sortOddEven {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 8, 9, 10};
        getEvenOrOdd(a);
    }


    public static void getEvenOrOdd(int a1[]) {
        int[] a2 = new int[a1.length];
        int index = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] % 2 == 0) {
                a2[index] = a1[i];
                index++;
            }
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] % 2 != 0) {
                a2[index] = a1[i];
                index++;
            }
        }
        for (int i = 0; i <a2.length ; i++) {
            System.out.print(a2[i]+",");
        }
    }
}
