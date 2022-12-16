package jalau.at18.katas.bankocr.joser;

public class Split {
    private static final int THREE = 3;
    private String[] scan;
    private int pos;

    public Split(String[] scan, int pos) {
        this.scan = scan;
        this.pos = pos * THREE;
    }

    public String[] getScaNumber() {
        String[] scaNumber = new String[THREE];
        scaNumber[0] = this.scan[0].substring(this.pos, this.pos + THREE);
        scaNumber[1] = this.scan[1].substring(this.pos, this.pos + THREE);
        scaNumber[2] = this.scan[2].substring(this.pos, this.pos + THREE);
        return scaNumber;
    }

}
