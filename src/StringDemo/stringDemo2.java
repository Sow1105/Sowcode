package StringDemo;

public class stringDemo2 {
    public static void main(String[] args) {
        String s = "My name is Sowjanya";
        String[] split = s.split(" ");
        for (int i = split.length-1; i >= 0; i--) {
            System.out.print(split[i] + " ");

        }
        s= s+ " D";
        System.out.println(s);
    }
}
