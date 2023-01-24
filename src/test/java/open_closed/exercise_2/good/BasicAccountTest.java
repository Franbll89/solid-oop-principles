package open_closed.exercise_2.good;

import open_closed.exercise_2.bad.Account;
import open_closed.exercise_2.bad.BasicAccount;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {

    @Test
    public void itShouldReturnTheBasicAccountId() {
        Account basicAccount = new BasicAccount(120000);


        assertTrue(basicAccount.getAccountId() instanceof UUID);

    }

    @Test
    public void itShouldAllowWithdraw() {
        // Account basicAccount = new BasicAccount(100);
        BasicAccount basicAccount = new BasicAccount(100);

        double expected = 89.9;
        System.out.println(basicAccount.getBalance());
        double result = basicAccount.withdraw(10);


        assertEquals(expected, result);

    }

    @Test
    public void itShouldDeposit10() {
        Account basicAccount = new BasicAccount(100);

        double expected = 110;
        double result = basicAccount.deposit(10);


        assertEquals(expected, result);

    }

}