package jalau.at18.katas.bankocr.joser;

import java.util.Arrays;

public class ParseDigit {
    private static final int NINE = 9;
    private String[] digit;
    private int index;

    public ParseDigit(String[] digit) {
        this.digit = digit;
    }

    public String getValue() {
        Boolean found = false;
        for (this.index = 0; !found && this.index <= NINE; this.index++) {
            found = compare(digit, Digits.values()[this.index].getCharacters());
        }
        return found ? (Digits.values()[this.index - 1].ordinal()) + "" : "?";
    }

    public Boolean compare(String[] digitN, String[] number) {
        if (Arrays.deepEquals(digitN, number)) {
            return true;
        }
        return false;
    }
}
