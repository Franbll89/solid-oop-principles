package open_closed.exercise_2.bad;

public class YearlyInterestAccount extends Account {
    private static final double YEARLY_INTEREST = 0.05;
    private static final double WITHDRAW_FEE = 1.5;
    private static final double TRANSFER_FEE = 2.5;
    private double balance;

    public YearlyInterestAccount(double balance) {
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

    public double applyInterest(int numberOfYears) {
        double compoundInterest = java.lang.Math.pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance * compoundInterest;
        return balance;
    }

    public double transfer(double amount, BasicAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, CheckingAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, MonthlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, YearlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }
}
