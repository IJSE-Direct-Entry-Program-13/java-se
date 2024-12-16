import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(".");
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for (Path p : stream) {
            System.out.println(p + " - " + (Files.isDirectory(p) ? "directory" : "file"));
        }
    }
}
