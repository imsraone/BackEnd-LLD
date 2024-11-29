package IntroOOPS;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String OwnerName;
    private List<String> Transactions;

    public BankAccount(){
        balance = 0;
        OwnerName = "";
        Transactions = new ArrayList<String>();
    }

    public BankAccount(String OwnerName, double balance) {
        this.OwnerName = OwnerName;
        this.balance = balance;
        Transactions = new ArrayList<String>();
        Transactions.add("Balance set $" + balance);
    }

    public void deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount cannot be negative");
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(amount < 0)
            throw new IllegalArgumentException("Amount cannot be negative");
        if (amount > balance)
            throw new IllegalArgumentException("Amount cannot be greater than balance");
        if (balance - amount < 0)
            throw new IllegalArgumentException("Amount cannot be less than balance");
        balance = balance - amount;
        Transactions.add("Withdraw $" + amount);
    }
    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isEmpty())
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        OwnerName = ownerName;
    }

    public void setBalance(double balance) {
        if(balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
        Transactions.add("Deposited $" + balance);
    }

    public void printTransactionsHistory() {
        for (String transaction : Transactions) {
            System.out.println(transaction);
        }
    }
}