import java.io.File;
import java.nio.file.Path;

public class Demo2 {
    public static void main(String[] args) {
        // These are bad pointers, these may cause problems in different operating systems
        // because the file separator char differs from operating system to operating system
        File badPointer1 = new File("hello/dep");
        Path badPointer2 = Path.of("hello/dep");

        // Instead you can do following,
        // Here you have to add the file separator explicitly
        File pointer1 = new File("hello" + File.separator + "dep");
        System.out.println(pointer1);

        File pointer2 = new File("hello" + File.separator + "dep" + File.separator + "phase-1");
        System.out.println(pointer2);

        // Here java.nio adds the file separator implicitly
        Path pointer3 = Path.of("hello", "dep");
        System.out.println(pointer3);

        Path pointer4 = Path.of("hello", "dep", "phase-1", "java-se");
        System.out.println(pointer4);
    }
}
