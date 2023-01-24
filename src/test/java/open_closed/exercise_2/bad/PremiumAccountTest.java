package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumAccountTest {

    @Test
    public void itShouldApplyInterest() {

        PremiumAccount premiumAccount = new PremiumAccount(100);

        double interest = premiumAccount.applyInterestYearly( 2);

        assertEquals(106.08999999999999, interest);

    }

}