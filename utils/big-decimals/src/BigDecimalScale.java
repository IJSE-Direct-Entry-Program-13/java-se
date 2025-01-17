import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalScale {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.625728");
        BigDecimal bd2 = new BigDecimal(5.625728);

        for (int i = 2; i < 5; i++) {
            System.out.println("Scale: " + i);
            System.out.println("Half Up: " + bd1.setScale(i, RoundingMode.HALF_UP));
            System.out.println("Half Up: " + bd2.setScale(i, RoundingMode.HALF_UP));

            System.out.println("Half Down: " + bd1.setScale(i, RoundingMode.HALF_DOWN));
            System.out.println("Half Down: " + bd2.setScale(i, RoundingMode.HALF_DOWN));

            System.out.println("Half Even: " + bd1.setScale(i, RoundingMode.HALF_EVEN));
            System.out.println("Half Even: " + bd2.setScale(i, RoundingMode.HALF_EVEN));

            System.out.println("Ceiling: " + bd1.setScale(i, RoundingMode.CEILING));
            System.out.println("Ceiling: " + bd2.setScale(i, RoundingMode.CEILING));

            System.out.println("Floor: " + bd1.setScale(i, RoundingMode.FLOOR));
            System.out.println("Floor: " + bd2.setScale(i, RoundingMode.FLOOR));

            System.out.println("Up: " + bd1.setScale(i, RoundingMode.UP));
            System.out.println("Up: " + bd2.setScale(i, RoundingMode.UP));

            System.out.println("Down: " + bd1.setScale(i, RoundingMode.DOWN));
            System.out.println("Down: " + bd2.setScale(i, RoundingMode.DOWN));
            System.out.println("==================================");
        }

    }
}
