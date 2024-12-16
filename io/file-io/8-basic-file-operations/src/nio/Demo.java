package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) {
        Path pointer = Path.of("test");
        try {
            Files.delete(pointer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
