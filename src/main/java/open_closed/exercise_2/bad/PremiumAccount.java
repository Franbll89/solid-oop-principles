package open_closed.exercise_2.bad;

public class PremiumAccount extends Account{

    private static final double YEARLY_INTEREST = 0.03;
    private static final double MONTHLY_INTEREST = 0.02;
    private double balance;

    protected PremiumAccount(double balance) {
        super(balance);
        this.balance = getBalance();
    }

    public double applyInterestMonthly(int numberOfMonths) {
        double compoundInterest = java.lang.Math.pow((1 + MONTHLY_INTEREST), numberOfMonths);
        balance = balance * compoundInterest;
        return balance;
    }

    public double applyInterestYearly(int numberOfYears) {
        double compoundInterest = java.lang.Math.pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance * compoundInterest;
        return balance;
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount;
        balance -= amountAfterFees;
        return balance;
    }
}
