package a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BenchmarkDemo2 {

    public static void main(String[] args) throws IOException {
        File desktopDir = new File(System.getProperty("user.home"), "Desktop");
        File file = new File(desktopDir, "mml-book.pdf");

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis =
                new BufferedInputStream(fis);
        long t1 = System.currentTimeMillis();
        while (true) {
            byte[] buf = new byte[1024 * 5];
            int read = bis.read(buf);
            if (read == -1) break;
        }
        long t2 = System.currentTimeMillis();
        bis.close();

        System.out.println("Diff: " + (t2 - t1));
    }
}
