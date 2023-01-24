package open_closed.exercise_2.bad;

import java.util.UUID;

public abstract class Account {
    //private double YEARLY_INTEREST;
    private double WITHDRAW_FEE;
    //private double TRANSFER_FEE;
    private UUID accountId = UUID.randomUUID();
    private double balance;

    protected Account(double balance) {
        this.balance = balance;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    //public abstract double withdraw(double amount);
}
