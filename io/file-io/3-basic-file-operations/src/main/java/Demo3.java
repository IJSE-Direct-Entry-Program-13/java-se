import java.io.File;
import java.util.Map;

public class Demo3 {

    public static void main(String[] args) {
        String username = System.getenv("USERNAME");
        System.out.println(username);
        String home = System.getenv("HOME");
        System.out.println(home);
        String shell = System.getenv("SHELL");
        System.out.println(shell);
        String path = System.getenv("PATH");
        System.out.println(path);

        System.out.println("===============================");

        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            System.out.println(key + "=" + envMap.get(key));
        }
        //envMap.forEach((k, v) -> System.out.println(k + "=" + v));

        //File desktopPointer = new File("/home/ranjith-suranga/Desktop");

    }
}
