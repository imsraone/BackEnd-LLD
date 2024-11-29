package IntroOOPS;

public class BankAccount {
    private double balance;
    private String OwnerName;

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
    }
}