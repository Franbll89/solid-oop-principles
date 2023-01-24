package liskov_substitution.bad;

import java.math.BigDecimal;

public class CurrentAccount extends AccountWithdrawable {
    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into CurrentAccount
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        // Withdraw from CurrentAccount
    }
}
