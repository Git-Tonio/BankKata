package jalau.at18.katas.bankocr.joser;

public class Converter {
    private static final int NINE = 9;
    private String[] scaned;
    private String numberScaned = "";

    public Converter(String[] scaned) {
        this.scaned = scaned;
    }

    public String getNumberScaned() {
        for (int index = 0; index < NINE; index++) {
            Split digitScan = new Split(this.scaned, index);
            this.numberScaned += parsed(digitScan.getScaNumber());
        }
        return numberScaned;
    }

    public String parsed(String[] sDigit) {
        ParseDigit parse = new ParseDigit(sDigit);
        return parse.getValue();
    }

}
