package String;

public class String1 {
    public static void main(String[] args) {
        String s="Hello Sowjanya";
        String s2 = new String("Hello Sowjanya");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}
