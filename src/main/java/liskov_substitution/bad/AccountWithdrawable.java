package liskov_substitution.bad;

import java.math.BigDecimal;

public abstract class AccountWithdrawable extends Account {

    protected abstract void withdraw(BigDecimal amount);
}
