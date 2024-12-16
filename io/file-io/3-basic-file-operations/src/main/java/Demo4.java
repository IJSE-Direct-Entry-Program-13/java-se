import java.io.File;
import java.nio.file.Path;

public class Demo4 {

    public static void main(String[] args) {
        //File desktopPointer = new File("/home/ranjith-suranga/Desktop");
        File desktopPointer1 = new File(System.getenv("HOME") + File.separator + "Desktop");
        System.out.println(desktopPointer1);

        Path desktopPointer2 = Path.of(System.getenv("HOME"), "Desktop");
        System.out.println(desktopPointer2);
    }
}
