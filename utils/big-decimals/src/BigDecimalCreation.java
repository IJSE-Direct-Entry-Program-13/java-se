import java.math.BigDecimal;

public class BigDecimalCreation {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.2");
        System.out.println(bd1);

        float f = 5.2f;
        double d = 5.2d;

        BigDecimal bd2 = new BigDecimal(f);
        BigDecimal bd3 = new BigDecimal(d);
        System.out.println(bd2);
        System.out.println(bd3);

        System.out.println(bd1.subtract(new BigDecimal("5.123")));
        System.out.println(bd2.subtract(new BigDecimal("5.123")));
        System.out.println(bd3.subtract(new BigDecimal("5.123")));
    }
}
