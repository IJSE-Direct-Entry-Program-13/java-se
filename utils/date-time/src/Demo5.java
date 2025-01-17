import java.time.*;
import java.time.temporal.ChronoUnit;

public class Demo5 {

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2022, Month.MARCH, 2);
        LocalDate today = LocalDate.now();

        Duration duration = Duration.between(dob.atStartOfDay(),
                today.atStartOfDay());
        Period period = Period.between(dob, today);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period);

        System.out.println(duration);
        System.out.println(duration.getNano());
        System.out.println(duration.getSeconds());
    }
}
