import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) {
        Path desktopDir = Path.of(System.getProperty("user.home"), "Desktop");
        Path testDir = desktopDir.resolve("test");
        Path somethingText = desktopDir.resolve("something.txt");

        System.out.println("Desktop exists? " + Files.exists(testDir));
        System.out.println("Desktop/test exists? " + Files.exists(testDir));
        System.out.println("Desktop/something.txt exists? " + Files.exists(somethingText));

        System.out.println("Is Desktop directory or file? " +
                (Files.isDirectory(testDir) ? "Directory" : "File"));
        System.out.println("Is Desktop/test directory or file? " +
                (Files.isDirectory(testDir) ? "Directory" : "File"));
        System.out.println("Is Desktop/something.txt directory or file? "+
                (Files.isDirectory(somethingText) ? "Directory" : "File"));
    }
}
