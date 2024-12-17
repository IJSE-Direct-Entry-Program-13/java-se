package a;

import java.io.File;
import java.io.FileInputStream;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        File file = new File("./hello-io.txt");
        FileInputStream fis = new FileInputStream(file);

        while (true) {
            byte[] buffer = new byte[1024];
            int read = fis.read(buffer);
            System.out.println(read);
            if (read == -1) break;
            System.out.println(new String(buffer,0, read));
        }

        fis.close();
    }
}
