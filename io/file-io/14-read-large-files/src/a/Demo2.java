package a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws Exception {
        File file = new File("./database.json");
        FileInputStream fis = new FileInputStream(file);

        while (true) {
            byte[] buffer = new byte[1024 * 10];
            int read = fis.read(buffer);
            if (read == -1) break;
            System.out.println(new String(buffer));
            Thread.sleep(500);
        }

        fis.close();
    }
}
