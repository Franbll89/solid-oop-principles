package open_closed.exercise_2.bad;

public class CheckingAccount extends Account {
    private static final double WITHDRAW_FEE = 0.15;
    private double balance;

    public CheckingAccount(double balance) {
        super(balance);
        this.balance = getBalance();
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

    public double transfer(double amount, BasicAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, CheckingAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, MonthlyInterestAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, YearlyInterestAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }
}
