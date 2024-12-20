package a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BenchmarkDemo {

    public static void main(String[] args) throws IOException {
        File desktopDir = new File(System.getProperty("user.home"), "Desktop");
        File file = new File(desktopDir, "mml-book.pdf");

        FileInputStream fis = new FileInputStream(file);
        long t1 = System.currentTimeMillis();
        while (true) {
            byte[] buf = new byte[1024 * 5];
            int read = fis.read(buf);
            if (read == -1) break;
        }
        long t2 = System.currentTimeMillis();
        fis.close();

        System.out.println("Diff: " + (t2 - t1));
    }
}
