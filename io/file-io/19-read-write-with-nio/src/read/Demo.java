package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        File file = new File("./.gitignore");
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        System.out.println(new String(buffer));

        Path path = Path.of("./.gitignore");
        System.out.println(Files.readString(path));

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));

        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
}
