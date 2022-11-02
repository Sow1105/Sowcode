package StringDemo;

import static java.lang.Character.charCount;

// To calculate occurrence of char in Array
public class stringDemo3 {
    public static void main(String[] args) {
        frequencyCount("My Name is Sowjanya");
    }

    public static void frequencyCount(String s) {

        s = s.replace(" ", "");
        while (s.length() > 0) {
            char ch = s.charAt(0);
            System.out.print(ch + ""+ "=" + countChar(s,ch)+"," );
            s = s.replace(""+ ch , "");
        }
    }

    public static int countChar(String s, char ch) {
        int count = 0;
        while (s.indexOf(ch) != -1) {
            count++;
            s = s.substring((s.indexOf(ch) + 1));
        }
        return count;
    }

}
