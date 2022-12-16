package jalau.at18.katas.bankocr.joser;

public class Check {
    private static final int EIGHT = 8;
    private static final int ELEVEN = 11;
    private String number;

    public Check(String number) {
        this.number = number;
    }

    public boolean checkNumber() {
        if (checkDigits() == 0) {
            return true;
        }
        return false;
    }

    public int checkDigits() {
        int acum = 0;
        for (int pos = EIGHT, sum = 1; pos >= 0; pos--, sum++) {
            acum += Character.getNumericValue(this.number.charAt(pos)) * sum;
        }
        return acum % ELEVEN;
    }

}
