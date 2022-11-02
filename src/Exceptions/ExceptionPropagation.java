package Exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        String name = exceptionTest.convertToUpperCase(null);
        System.out.println(name);
    }
}
