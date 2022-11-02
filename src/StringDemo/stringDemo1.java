package StringDemo;

import java.util.Locale;

public class stringDemo1 {
    public static void main(String[] args) {
        String s="Sowjanya";
        System.out.println(s.length());
        char c = s.charAt(3);
        System.out.println(c);
        String s1 = s.toUpperCase();
        System.out.println(s1);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));


    }
}
