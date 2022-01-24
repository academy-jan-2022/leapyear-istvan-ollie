import LeapYear.example.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {

    @Test
    public void
    return_false_when_passed_0() {
        var leapYear = new LeapYear();
        var result = leapYear.check(0);
        assertFalse(result);
    }
    @Test
    void return_true_when_passed_8() {
        var leapYear = new LeapYear();
        var result = leapYear.check(8);
        assertTrue(result);
    }

    @Test
    public void
    return_true_when_passed_4(){
        var leapYear = new LeapYear();
        var result = leapYear.check(4);
        assertTrue(result);
    }

    @Test
    void
    return_true_when_passed_12() {
        var leapYear = new LeapYear();
        var result = leapYear.check(12);
        assertTrue(result);
    }

    @Test
    void return_false_when_passed_100() {
        var leapYear = new LeapYear();
        var result = leapYear.check(100);
        assertFalse(result);
    }

}
