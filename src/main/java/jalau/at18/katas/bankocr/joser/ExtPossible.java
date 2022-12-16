package jalau.at18.katas.bankocr.joser;

public class ExtPossible {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String numberSet) {
        this.number = numberSet;
    }

    public String getPossiblity(int index, String[] oldNumber) {
        Split digitScan = new Split(oldNumber, index);
        String[] numT = digitScan.getScaNumber();
        Reconstruct data = new Reconstruct(numT);
        return data.result();
    }

    public String setPos(int index, char data, String oldNumber) {
        // System.out.println(index + "<<>>" + data + "<<>>" + oldNumber);
        StringBuilder numerTest = new StringBuilder(oldNumber);
        numerTest.setCharAt(index, data);
        return numerTest.toString();
    }

    public String isPossibility(String resNum) {
        // System.out.println(">>" + resNum);
        Check check = new Check(resNum);
        return check.checkNumber() && resNum.indexOf("?") == -1 ? "'" + resNum + "', " : "";
    }
}
