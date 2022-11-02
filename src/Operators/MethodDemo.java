package Operators;

public class MethodDemo {

    public static void main(String[] args) {

        Bank b = getBank("SBI", "1234", 10000.00);

        b.deposit(1000);

        showBalance(b);

        b.withDraw(5000);

        showBalance(b);


        test(b.name);
        test("vinod");

        Bank b1 = getBank( "SBI", "9999999", 12345.00);
        Bank b2 = getBank( "HDFC", "4356346", 123544545.00);
        Bank b3 = getBank( "ICICI", "999565659999", 6565645);
        Bank b4 = getBank( "KOTAK", "65666767", 12357545.050);

    }

    private static Bank getBank(String name, String accNumber, double balance) {
        Bank b = new Bank();
        b.name = name;
        b.accountNumber = accNumber;
        b.accountBalance = balance;
        return b;
    }

    private static void showBalance(Bank bank) {

        System.out.println("Account: " + bank.accountNumber + " has " + "Rs." +bank.accountBalance);
    }


    public static void test(String a){
        System.out.println("we are in test method");
        demo(a);
    }

    private static void demo(String a) {
        System.out.println("we are in demo method");

        sample(a);
    }

    private static void sample(String a) {
        System.out.println("we are in sample method");
        System.out.println(a);
    }

    public String setPin(String pin){
        return pin;
    }
}