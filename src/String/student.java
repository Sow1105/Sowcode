package String;

public class student {
    public static void main(String[] args) {
    }

    public student() {
        System.out.println("memory is created");
    }

    public String studentName;
    public String rollNo;
    public String DOB;

    public student(String s, String r, String d) {
        this.studentName = s;
        this.rollNo = r;
        this.DOB = d;


    }

    public student(String s1, String r1) {
        this.studentName = s1;
        this.rollNo = r1;

    }

    public student(String s2) {
        this.studentName = s2;
    }

}
