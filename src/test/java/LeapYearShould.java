import LeapYear.example.LeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearShould {

    private LeapYear leapYear;

    @BeforeEach
    public void SetUp(){
        leapYear = new LeapYear();
    }
    @Test
    public void
    return_false_when_passed_0() {
        var result = leapYear.check(0);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"4, true",
                "8, true",
                "12, true"
    })
    void return_true_when_divisible_by_4(int input, boolean expectedOutput){
        var result = leapYear.check(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    void return_false_when_passed_100() {
        var result = leapYear.check(100);
        assertFalse(result);
    }

    @Test
    void return_false_when_passed_200() {
        var result = leapYear.check(200);
        assertFalse(result);
    }

    @Test
    void return_false_when_passed_300() {
        var result = leapYear.check(300);
        assertFalse(result);
    }

    @Test
    void return_true_when_passed_400() {
        var result = leapYear.check(400);
        assertTrue(result);
    }
}
