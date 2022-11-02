package Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] a= new int[50];
        for (int i =0, j = 5; i<a.length; i++){
            a[i]=j;
            j=j+5;
            System.out.println(a[i]);

        }
//        for(int i=0;i<a.length;i++)
//        System.out.println(a[i]);
    }
}
