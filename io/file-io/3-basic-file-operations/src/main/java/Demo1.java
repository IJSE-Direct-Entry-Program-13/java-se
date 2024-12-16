import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo1 {

    public static void main(String[] args) {
        Path pointer1 = Path.of("/home/ranjith-suranga/Desktop/test");
        System.out.println(Files.exists(pointer1));

        Path pointer2 = Path.of("/home/ranjith-suranga/Desktop/test/adfjlasfj/asdfjlf");
        System.out.println(Files.exists(pointer2));

        Path pointer3 = Path.of("");
        System.out.println(pointer3.toAbsolutePath());

        Path pointer4 = Path.of("hello/ijse");
        System.out.println(pointer4.toAbsolutePath());

        Path pointer5 = Paths.get("/home/ranjith-suranga/Desktop/test");
        System.out.println(Files.exists(pointer5));

        Path pointer6 = Paths.get("");
        System.out.println(pointer6.toAbsolutePath());
    }
}
