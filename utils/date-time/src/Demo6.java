import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo6 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10, 5);
        LocalTime t2 = LocalTime.now();
        long hours = ChronoUnit.HOURS.between(t1, t2);
        long minutes = ChronoUnit.MINUTES.between(t1, t2);
        long seconds = ChronoUnit.SECONDS.between(t1, t2);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

        LocalDate day1 = LocalDate.of(2025, Month.JANUARY, 1);
        LocalDate day2 = LocalDate.of(2025, Month.MARCH, 10);
        Period between = Period.between(day1, day2);
        System.out.println(between);

        System.out.println(ChronoUnit.DAYS.between(day1, day2));
    }
}
