package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo2 {

    public static void main(String[] args) {
        Path pointer = Path.of("test");
        try {
            System.out.println("Deleted? " + Files.deleteIfExists(pointer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
