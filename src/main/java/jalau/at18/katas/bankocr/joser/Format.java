package jalau.at18.katas.bankocr.joser;

public class Format {
    private String number;
    private Check checksum;

    public Format(String number) {
        this.number = number;
        this.checksum = new Check(this.number);
    }

    public String formated() {
        if (isIll()) {
            return number + " ILL";
        }
        return isERR() ? number + " ERR" : number;
    }

    public boolean isIll() {
        if (this.number.indexOf("?") != -1) {
            return true;
        }
        return false;
    }

    public boolean isERR() {
        if (!checksum.checkNumber()) {
            return true;
        }
        return false;
    }
}
