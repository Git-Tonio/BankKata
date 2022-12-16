package jalau.at18.katas.bankocr.joser;

public class Possible extends ExtPossible {
    private String[] numberScan;
    private String result;
    private static final int NINE = 9;

    public Possible(String[] numberScan) {
        Converter conv = new Converter(numberScan);
        String values = conv.getNumberScaned();
        setNumber(values);
        this.numberScan = numberScan;
        this.result = "[";
    }

    public String getAmb() {
        for (int index = 0; index < NINE; index++) {
            tourPossibilities(index, getNumber());
        }
        return result.substring(0, result.length() - 2) + "]";
    }

    public void tourPossibilities(int index, String number) {
        String posib = getPossiblity(index, this.numberScan);
        for (int jindex = 0; posib.length() > 0 && jindex < posib.length(); jindex++) {
            result += isPossibility(setPos(index, posib.charAt(jindex), number));
        }
    }
}