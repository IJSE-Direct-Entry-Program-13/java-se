import java.math.BigDecimal;

public class HelloBigDecimal {

    public static void main(String[] args) {
        float f1 = 3.5f;
        float f2 = 3.4f;
        float f3 = f1 - f2;
        System.out.println(f3);

        double d1 = 3.5;
        double d2 = 3.4;
        double d3 = d1 - d2;
        System.out.println(d3);

        BigDecimal b1 = new BigDecimal(3.5);
        BigDecimal b2 = new BigDecimal(3.4);
        BigDecimal b3 = b1.subtract(b2);
        System.out.println(b3);

        BigDecimal bd1 = new BigDecimal("3.5");
        BigDecimal bd2 = new BigDecimal("3.4");
        BigDecimal bd3 = bd1.subtract(bd2);
        System.out.println(bd3);
    }
}
