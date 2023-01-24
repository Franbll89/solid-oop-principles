package open_closed.exercise_2.bad;

public class BasicAccount extends Account {

    private static final double WITHDRAW_FEE = 0.1;
    private static final double TRANSFER_FEE = 1.5;
    private double balance;

    public BasicAccount(double balance) {
        super(balance);
        this.balance = getBalance();
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
