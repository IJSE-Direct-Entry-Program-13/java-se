package b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDemo2 {

    public static void main(String[] args) throws IOException {
        File file = new File("./hello-io.txt");
        FileInputStream fis = new FileInputStream(file);

//        while(true) {
//            int byteValue = fis.read();
//            if (byteValue == -1) break;
//            System.out.print((char)byteValue);
//        }

        int read;
        while ((read = fis.read()) != -1) {
            System.out.print((char) read);
        }

        fis.close();
    }
}
