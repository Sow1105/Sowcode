package StringDemo;

public class Bank {
    String name = "";
    String accountNumber;
    String userId;
    double accountBalance;


    public static void main(String[] args) {

        Bank b = new Bank();
        b.name = "Sowjanya";
        b.accountNumber = "12345";
        b.accountBalance = 56978;
        withDraw(b.accountBalance);
        deposit(b.accountBalance);
    }
    private static double withDraw(double accountBalance){
        int withDraw = 100000;
        if (accountBalance>withDraw){
       accountBalance= accountBalance -withDraw;
        System.out.println(accountBalance);}
        else {
            System.out.println("insufficient balance");
        }
        return accountBalance;
    }
    private static double deposit(double accountBalance){
        int deposit = 1000;
        accountBalance= accountBalance +deposit;
        System.out.println(accountBalance);
        return accountBalance;
    }


}
