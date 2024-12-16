import java.io.File;
import java.nio.file.Path;

public class Demo8 {

    public static void main(String[] args) {
        Path homeDir = Path.of(System.getProperty("user.home"));
        Path desktopDir = homeDir.resolve("Desktop");
        Path abcOfDesktop = desktopDir.resolve("abc");
        Path edfOfDesktop = desktopDir.resolve("edf");
        Path abcOfDocuments = homeDir.resolve("Documents", "abc");

        Path tempDir = Path.of(System.getProperty("java.io.tmpdir"));
        Path pointer = tempDir.resolve("ijse", "cmjd", "final", "something.txt");
        System.out.println(pointer);

        File filePointer = pointer.toFile();
        Path pathPointer = filePointer.toPath();
    }
}
