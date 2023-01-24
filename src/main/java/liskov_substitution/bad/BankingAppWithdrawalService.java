package liskov_substitution.bad;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private AccountWithdrawable account;

    public BankingAppWithdrawalService(AccountWithdrawable account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
