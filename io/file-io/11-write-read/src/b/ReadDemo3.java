package b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadDemo3 {

    public static void main(String[] args) throws IOException {
        File file = new File("./hello-io.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[fis.available()];
        System.out.println(Arrays.toString(bytes));
        fis.read(bytes);
        System.out.println(Arrays.toString(bytes));
        fis.close();
//        for (byte aByte : bytes) {
//            System.out.print((char) aByte);
//        }
        System.out.println(new String(bytes));
    }
}
