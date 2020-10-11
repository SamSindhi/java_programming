public class Convert {
    public int numberLength(int number, NumberLengthVariants variant) {
        if (NumberLengthVariants.ARITHMETIC == variant) {
            int length = 0;
            if (number == 0) {
                return 1;
            }
            while (number != 0) {
                length++;
                number /= 10;
            }
            return length;
        } else {
            String num = String.valueOf(number);
            return num.length();
        }
    }

    public int pow(int n, int i) {
        if (i == 0) {
            return 1;
        }
        --i;
        return n * pow(n, i);
    }

    public int fromBinaryToDec(int binary) {
        int length = numberLength(binary, NumberLengthVariants.ARITHMETIC);
        if (length == 1) {
            return (binary == 1) ? 1 : 0;
        }
        int subt = pow(10, length - 1);
        if (binary / subt == 1) {
            return pow(2, length - 1) + fromBinaryToDec(binary - (subt));
        } else {
            return fromBinaryToDec(binary - (subt));
        }
    }

    public int fromDecToBinary(int dec) {
        String number = "";
        int num = dec;
        while (num > 0) {
            int binaryEq = 1;
            int j = 1;
            while(binaryEq < num) {
                binaryEq = pow(2, j);
                j++;
            }
            num -= pow(2, --j);

        }
        return dec;
    }
}
