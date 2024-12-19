package write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Demo {

    public static void main(String[] args) throws IOException {
        File file = new File("./io.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write("Hello File IO".getBytes());
        fos.close();

        Path path = Path.of("./nio.txt");
        Files.writeString(path, "Hello File NIO", StandardOpenOption.APPEND);

        Path path2 = Path.of("./nio-2.txt");
        byte[] bytes = {65,66,67,68,69};
        Files.write(path2, bytes);
    }
}
