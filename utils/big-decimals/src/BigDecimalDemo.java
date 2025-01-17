import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        double d1 = 0.4;
        double d2 = 0.3;
        double d3 = d1 - d2;
        System.out.println(d3);

        System.out.println(new BigDecimal(d1 + "").subtract(new BigDecimal(d2 + "")));
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        System.out.println(bd1.subtract(bd2));
    }
}
