import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double miles = 1428571.4285714286;
        double cashValue = 5000;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(miles, rewardValue.getMilesValue(), 0.001); // Allow a small delta for precision
    }

    @Test
    void convert_from_miles_to_cash() {
        double miles = 2000;
        var rewardValue = new RewardValue(miles, true);
        double expectedCashValue = 2000 * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001);
    }
}
