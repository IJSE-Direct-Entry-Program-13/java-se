package a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.psd");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        fis.close();

        byte[] first4Bytes = {bytes[0], bytes[1], bytes[2], bytes[3]};
        byte[] second2Bytes = {bytes[4], bytes[5]};

        byte[] height4Bytes = {bytes[14], bytes[15], bytes[16], bytes[17]};
        byte[] width4Bytes = {bytes[18], bytes[19], bytes[20], bytes[21]};

        System.out.println(new String(first4Bytes));
        System.out.println(Arrays.toString(second2Bytes));
        System.out.println(Arrays.toString(height4Bytes));
        System.out.println(Arrays.toString(width4Bytes));
    }
}
