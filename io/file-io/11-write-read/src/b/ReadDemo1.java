package b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo1 {

    public static void main(String[] args) throws IOException {
        File file = new File("./hello-io.txt");
        FileInputStream fis = new FileInputStream(file);

        int firstByte = fis.read();
        int secondByte = fis.read();
        int thirdByte = fis.read();

        System.out.println((char) firstByte);
        System.out.println((char) secondByte);
        System.out.println((char) thirdByte);

        fis.close();
    }
}
