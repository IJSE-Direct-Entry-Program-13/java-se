import java.math.BigInteger;

public class BigIntegerCreation {

    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("10");
        // new BigInteger(10);
        byte b = 10;
        short s = 20;
        char c = 30;
        int d = 40;
        long e = 50;
        BigInteger bigInt2 = new BigInteger(b + "");
        BigInteger bigInt3 = BigInteger.valueOf(b);
        BigInteger bigInt4 = BigInteger.valueOf(s);
        BigInteger bigInt5 = BigInteger.valueOf(c);
        BigInteger bigInt6 = BigInteger.valueOf(d);
        BigInteger bigInt7 = BigInteger.valueOf(e);
    }
}
