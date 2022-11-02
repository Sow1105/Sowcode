package String;

public class studentConstructor1 {
    public static void main(String[] args) {
        student s = new student();
        student s1 = new student("Sowjanya", "1234", "11-05-1996");
        student s2 = new student("Sowjanya", "1234");
        student s3 = new student("Sowjanya");
        System.out.println(s);
        System.out.println(s1);
    }
}

