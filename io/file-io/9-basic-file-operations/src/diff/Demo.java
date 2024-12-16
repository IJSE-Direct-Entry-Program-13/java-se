package diff;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) throws IOException {
        File pointer1 = new File("hello");
        pointer1.exists();
        pointer1.delete();

        Path pointer2 = Path.of("hello");
        Files.exists(pointer2);
        Files.delete(pointer2);
    }
}
