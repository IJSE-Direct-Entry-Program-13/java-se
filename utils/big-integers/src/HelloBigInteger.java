import java.math.BigInteger;

public class HelloBigInteger {

    public static void main(String[] args) {
        System.out.println("int max value: " + Integer.MAX_VALUE);
        System.out.println("int min value: " + Integer.MIN_VALUE);
        System.out.println("long max value: " + Long.MAX_VALUE);
        System.out.println("long min value: " + Long.MIN_VALUE);

        int maxInt = 2147483647;
        int minInt = -2147483648;
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

        long maxLong2 = maxLong + 1;
        System.out.println(maxLong2);

        BigInteger bigInt = new BigInteger("9223372036854775807");
        // BigInteger bigInt2 = bigInt + 1;
        BigInteger bigInt2 = bigInt.add(new BigInteger("10"));
        System.out.println(bigInt2);

        int x = 5;
        int y = 2;
        int result = (x + y + 3) * 2;
        System.out.println(result);

        // Via method chaining
        BigInteger bigIntX = new BigInteger("5");
        BigInteger bigIntY = new BigInteger("2");
        BigInteger bigIntResult = bigIntX.add(bigIntY).add(new BigInteger("3"))
                .multiply(new BigInteger("2"));
        System.out.println(bigIntResult);
    }
}
