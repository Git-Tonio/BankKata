package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FormatTest {
    @Test
    public void testFormated() {

        Format form;
        String numbers = "123456789";
        form = new Format(numbers);
        assertEquals("123456789", form.formated());

        numbers = "1?3456789";
        form = new Format(numbers);
        assertEquals("1?3456789 ILL", form.formated());

        numbers = "723456789";
        form = new Format(numbers);
        assertEquals("723456789 ERR", form.formated());

    }

}
