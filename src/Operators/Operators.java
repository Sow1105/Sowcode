package Operators;

public class Operators {
    public static void main(String[] args) {
     int a= 10;
    int b=5;

    boolean result1= a<b;
        boolean result2= a>b;
        boolean result3= a<=b;
        boolean result4= a>=b;
        boolean result5= a==b;
        boolean result6= a!=b;
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);
        System.out.println(result1 || result4);
        System.out.println(result2|| result6);
        System.out.println(result3 || result5);
        System.out.println(result1 && result4);
        System.out.println(result2 && result6);
        System.out.println(result3 && result5);
    }


}
