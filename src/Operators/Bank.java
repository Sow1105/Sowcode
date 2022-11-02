package Operators;

public class Bank {

    public String name;

    public String accountNumber;

    public double accountBalance;

    public String pin;


    public void withDraw(double amount){
        accountBalance = accountBalance - amount;
    }

    public void deposit(double amount){
        accountBalance = accountBalance + amount;
    }

    public String setPin(String userPin){
        return pin = userPin;
    }

}