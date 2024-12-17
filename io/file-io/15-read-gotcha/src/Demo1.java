import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("./file-io.txt");
        FileInputStream fis = new FileInputStream(file);
        while (true) {
            int readByteValue = fis.read();
            System.out.println(readByteValue);
            if (readByteValue == -1) break;
        }
        fis.close();
    }
}
