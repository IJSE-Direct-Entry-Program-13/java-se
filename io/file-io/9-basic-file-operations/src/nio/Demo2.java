package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo2 {
    public static void main(String[] args) {
        Path path = Path.of(System.getProperty("user.home"), "Desktop", "ijse", "cmjd", "buddhi", "kamala haris");
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
