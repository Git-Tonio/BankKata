package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SplitTest {
    @Test
    public void testGetScaNumber() {

        String[] scan = new String[] {"    _  _  _  _  _  _     _ ",
                                      "|_||_|| ||_||_   |  |  ||_ ",
                                      "  | _||_||_||_|  |  |  | _|" };
        Split split = new Split(scan, 0);
        String[] four = new String[] {"   ",
                                      "|_|",
                                      "  |" };
        assertArrayEquals(four, split.getScaNumber());

        split = new Split(scan, 1);
        String[] nine = new String[] {" _ ",
                                      "|_|",
                                      " _|" };
        assertArrayEquals(nine, split.getScaNumber());

        split = new Split(scan, 8);
        String[] five = new String[] {" _ ",
                                      "|_ ",
                                      " _|" };
        assertArrayEquals(five, split.getScaNumber());
    }
}
