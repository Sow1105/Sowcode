package Test;


public class Test {
    public static void main(String[] args) {
        String s = "My name is Nikhil";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);

        }
    }
}
