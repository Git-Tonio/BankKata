package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckTest {
    @Test
    public void testCheckDigits() {
        Check check;
        String numbers;

        numbers = "123456789";
        check = new Check(numbers);
        assertTrue(check.checkNumber());

        numbers = "723456789";
        check = new Check(numbers);
        assertFalse(check.checkNumber());

        numbers = "?23456789";
        check = new Check(numbers);
        assertFalse(check.checkNumber());

    }
}
