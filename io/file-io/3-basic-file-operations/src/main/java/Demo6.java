import java.io.File;
import java.nio.file.Path;

public class Demo6 {

    public static void main(String[] args) {
        File pointer1 = new File(System.getProperty("user.home") + File.separator + "Desktop");
        Path pointer2 = Path.of(System.getProperty("user.home"), "Desktop");

        System.out.println(pointer1);
        System.out.println(pointer2);
    }
}
