import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./file-io.txt");
        FileInputStream fis = new FileInputStream(file);
        while (true) {
            byte[] buffer = new byte[50];
            int read = fis.read(buffer);
            System.out.println("Read: " + read);
            if (read == -1) break;
        }
        fis.close();
    }
}
