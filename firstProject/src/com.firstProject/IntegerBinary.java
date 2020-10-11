public class IntegerBinary {
    private int binary;

    public IntegerBinary(int binary) {
        if (String.valueOf(binary).contains("1") || String.valueOf(binary).contains("0")) {
            this.binary = binary;
        }
        else {
            Convert convert = new Convert();
            this.binary = convert.fromBinaryToDec(binary);
        }
    }

    public int getBinary() {
        return binary;
    }

}
