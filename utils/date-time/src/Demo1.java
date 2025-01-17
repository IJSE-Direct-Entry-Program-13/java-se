import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.HOUR, 12);
        Date date2 = cal.getTime();
        System.out.println(date2);

        String str = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss")
                .format(date2);
        System.out.println(str);
    }
}
