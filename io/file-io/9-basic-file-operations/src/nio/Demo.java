package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) {
        Path testDir = Path.of(System.getProperty("user.home"), "Desktop", "test");

        for (int i = 0; i < 10; i++) {
            Path newFolderPath = testDir.resolve("my-nio-folder-" + i);
            try {
                System.out.println(Files.createDirectory(newFolderPath) == newFolderPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
