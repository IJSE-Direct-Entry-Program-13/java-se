import java.util.Properties;

public class Demo5 {

    public static void main(String[] args) {
        Properties envMap = System.getProperties();
        envMap.forEach((k, v) -> System.out.println(k + "=" + v));

        String home = System.getProperty("user.home");
        System.out.println(home);

        String osArch = System.getProperty("os.arch");
        System.out.println(osArch);

        String tempDir = System.getProperty("java.io.tmpdir");
        System.out.println(tempDir);
    }
}
