import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingDemo2 {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.53");
        System.out.println(bd1.setScale(1, RoundingMode.UP));
        System.out.println(bd1.setScale(1, RoundingMode.CEILING));

        System.out.println("===================");

        BigDecimal bd2 = new BigDecimal("-5.53");
        System.out.println(bd2.setScale(1, RoundingMode.UP));
        System.out.println(bd2.setScale(1, RoundingMode.CEILING));
    }
}
