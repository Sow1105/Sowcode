package Exceptions;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            try {
                e=null;
                e.printStackTrace();
            }catch (NullPointerException npe){
                String  message = npe.getMessage();
                System.out.println(message);
            }

            String message = e.getMessage();
            System.out.println(message);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        }
        try {
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        }  catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("After exception");
    }
}
