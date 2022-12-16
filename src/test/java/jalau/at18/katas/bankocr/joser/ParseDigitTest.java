package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParseDigitTest {
    @Test
    public void testGetValue() {
        ParseDigit digit;

        String[] zeroNumber = new String[] {" _ ",
                                            "| |",
                                            "|_|" };
        digit = new ParseDigit(zeroNumber);
        assertEquals("0", digit.getValue());

        String[] oneNumber = new String[] {"   ",
                                           "  |",
                                           "  |" };
        digit = new ParseDigit(oneNumber);
        assertEquals("1", digit.getValue());

        String[] nineNumber = new String[] {" _ ",
                                            "|_|",
                                            " _|" };
        digit = new ParseDigit(nineNumber);
        assertEquals("9", digit.getValue());

        String[] twoNumber = new String[] {" _ ",
                                           "|  ",
                                           "|_|" };
        digit = new ParseDigit(twoNumber);
        assertEquals("?", digit.getValue());
    }
}
