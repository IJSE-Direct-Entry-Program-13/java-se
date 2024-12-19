package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("./target");
        System.out.println(Files.exists(path));

        // Stream<Path> pathStream = Files.walk(path);
        Stream<Path> pathStream = Files.walk(path);
        pathStream.forEach(p -> {
            System.out.println(p);
            try {
                if (!Files.isDirectory(p)) Files.delete(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Files.delete(path);
    }
}

