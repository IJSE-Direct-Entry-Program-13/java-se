import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingDemo {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.53");
        System.out.println(bd1.setScale(1, RoundingMode.DOWN));
        System.out.println(bd1.setScale(1, RoundingMode.FLOOR));

        System.out.println("===================");

        BigDecimal bd2 = new BigDecimal("-5.53");
        System.out.println(bd2.setScale(1, RoundingMode.DOWN));
        System.out.println(bd2.setScale(1, RoundingMode.FLOOR));
    }
}
