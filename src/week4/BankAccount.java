package week4;

public class BankAccount {

    //attributes
    private String owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(String owner, int acct) {
        this.owner = owner;
        accountNum = acct;
        balance = 0;
    }


    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }

    //print methods
    public String toString() {
        String out = owner + " with account " + accountNum;
        out += " has balance " + balance;
        return out;
    }
}
