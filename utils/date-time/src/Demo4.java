import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Demo4 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,
                Month.MARCH, 5);
        System.out.println(date);
        LocalDate newDate = date.plus(2,
                ChronoUnit.MONTHS);
        System.out.println(newDate);

        LocalTime time = LocalTime.of(14, 25);
        System.out.println(time);
        LocalTime newTime = time.plusHours(2);
        System.out.println(newTime);

        LocalDateTime localDateTime = LocalDateTime.of(
                2020, Month.MARCH, 5,
                14, 25, 25);
        System.out.println(localDateTime);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
