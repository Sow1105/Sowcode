package DiamondProblem;

public interface B extends A {
    public default void display() {
        System.out.println("class B");
    }
}
