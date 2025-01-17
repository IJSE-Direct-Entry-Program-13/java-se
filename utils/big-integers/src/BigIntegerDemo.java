import java.math.BigInteger;

public class BigIntegerDemo {

    public static void main(String[] args) {
        System.out.println(new BigInteger("5").add(new BigInteger("1")));
        System.out.println(new BigInteger("5").add(BigInteger.ONE));

        long x = Long.MAX_VALUE;
        System.out.println(BigInteger.valueOf(x).multiply(new BigInteger("10")));
        System.out.println(BigInteger.valueOf(x).multiply(BigInteger.TEN));

        System.out.println("6/-2=" + new BigInteger("6").divide(new BigInteger("-2")));
        System.out.println("-6/2=" + new BigInteger("-6").divide(new BigInteger("2")));

        System.out.println("6%-5=" + new BigInteger("6").remainder(new BigInteger("-5")));
        System.out.println("-6%5=" + new BigInteger("-6").remainder(new BigInteger("5")));
    }
}
