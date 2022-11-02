package Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] a =new int[50];
        for (int i =0, j=2; i <50; i++){
            a[i] = j;
            j = j+2;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}


