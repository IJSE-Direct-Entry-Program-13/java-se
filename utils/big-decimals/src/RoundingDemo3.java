import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingDemo3 {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.43");
        System.out.println(bd1.setScale(1, RoundingMode.HALF_UP));
        System.out.println(bd1.setScale(1, RoundingMode.HALF_DOWN));
        System.out.println(bd1.setScale(1, RoundingMode.HALF_EVEN));

        System.out.println("===================");

        BigDecimal bd2 = new BigDecimal("5.46");
        System.out.println(bd2.setScale(1, RoundingMode.HALF_UP));
        System.out.println(bd2.setScale(1, RoundingMode.HALF_DOWN));
        System.out.println(bd2.setScale(1, RoundingMode.HALF_EVEN));

        System.out.println("===================");

        BigDecimal bd3 = new BigDecimal("5.45");
        System.out.println(bd3.setScale(1, RoundingMode.HALF_UP));
        System.out.println(bd3.setScale(1, RoundingMode.HALF_DOWN));
        System.out.println(bd3.setScale(1, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("5.35")
                .setScale(1, RoundingMode.HALF_EVEN));
    }
}
