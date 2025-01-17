import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        Date date = Date.valueOf("2025-01-02");
        Time time = Time.valueOf("15:10:02");
        Timestamp timestamp = Timestamp.valueOf("2025-01-02 15:10:02");

        System.out.println(date);
        System.out.println(time);
        System.out.println(timestamp);

       /* 1 */ java.util.Date date1 = new java.util.Date(date.getTime());
        Calendar calendar = Calendar.getInstance();
       /* 2 */ calendar.setTime(date1);
        calendar.add(Calendar.YEAR, 2);
       /* 3 */ java.util.Date date2 = calendar.getTime();
       /* 4 */ Date date3 = new Date(date2.getTime());
        System.out.println(date3);
    }
}
