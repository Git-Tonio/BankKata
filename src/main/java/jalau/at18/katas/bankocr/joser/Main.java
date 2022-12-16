package jalau.at18.katas.bankocr.joser;

public class Main {
    private static final int THIRTEEN = 13;
    private static final int ELEVEN = 11;

    public static void main(String[] args) {
        String[] scaned = new String[] {" _     _  _  _  _  _  _    ",
                                        "| || || || || || || ||_   |",
                                        "|_||_||_||_||_||_||_| _|  |" };
        System.out.println(init(scaned));
    }

    public static String init(String[] scaned) {
        Converter value = new Converter(scaned);
        String values = value.getNumberScaned();
        Check check = new Check(values);
        return options(check.checkNumber(), values, scaned);
    }

    public static String options(Boolean check, String values, String[] scaned) {
        Possible possible = new Possible(scaned);
        String valuesPos = possible.getAmb();
        return check ? values : process(values, valuesPos);
    }

    public static String process(String values, String valuesPos) {
        return valuesPos.length() > THIRTEEN ? values + " AMB " + valuesPos : valuesPos.substring(2, ELEVEN);
    }

}
