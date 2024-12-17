package a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("./large-image.jpeg");
        FileInputStream fis = new FileInputStream(file);

        int numOfReads = 0;
        while (true) {
            byte[] bytes = new byte[1024];
            int read = fis.read(bytes);
            if (read == -1) break;
            numOfReads++;
        }

        fis.close();
        System.out.println(numOfReads);
    }
}
