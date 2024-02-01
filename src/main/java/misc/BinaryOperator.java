package misc;

public class BinaryOperator {

    public static void main(String[] args) {

        int decimal = 10;
        int binary = 0b1010_1111_1001;
        int octal = 017;
        int hexa = 0xAF9;

        System.out.println("decimal: " + decimal);
        System.out.println("binary: " + binary);
        System.out.println("octal: " + octal);
        System.out.println("hexa: " + hexa);
        System.out.println("==============================");

        int x = 0b1001; // 9
        int y = 0b0011; // 3

        int resultAnd = x & y; // 1
        int resultOr = x | y;
        int resultXor = x ^ y;
        int resultInvert = ~x;

        System.out.println("&: " + resultAnd);
        System.out.println("|: " + resultOr);
        System.out.println("^: " + resultXor);
        System.out.println("~: " + resultInvert);
        System.out.println("==============================");

        byte msb = (byte)0b1000_0000; // Most Significant Bit
        System.out.println("byte: " + msb);

        int someByte = 0b0000_0011;
        System.out.println("some byte: " + someByte);

        int shiftLeft = someByte << 1;
        System.out.println("shift left: " + shiftLeft);

        int someBit = 0b0000_0001;
        System.out.println("some bit: " + someBit);
        System.out.println("some bit: " + (someBit<<2));
        //System.out.println("some bit: " + (someBit<<31));
        System.out.println("==============================");

        int someInt = 0b1000_0000__0000_0000__0000_0000__0000_0000;
        System.out.println("Some Int: " + someInt);
        int shiftRight = someInt >> 31;
        System.out.println("shiftRight: " + shiftRight);
        int shiftUnsignedRight = someInt >>> 31;
        System.out.println("shiftUnsignedRight: " + shiftUnsignedRight);
    }
}
