import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

public class Demo3 {

    public static void main(String[] args) {
        Time time = Time.valueOf("14:17:00");
        Date date = new Date(time.getTime());
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        java.util.Date time1 = calendar.getTime();
        System.out.println(time1);
    }
}
