package DiamondProblem;

public class D implements C, B {
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }


    @Override
    public void display() {
        B.super.display();
        C.super.display();
    }

}
