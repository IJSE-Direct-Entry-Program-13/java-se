package reader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        File file = new File("io-write.txt");
        FileOutputStream fos = new FileOutputStream(file);

        char[] myChars = "Hello Output Streams".toCharArray();
        byte[] byteBuffer = new byte[myChars.length];
        for (int i = 0; i < myChars.length; i++) {
            byteBuffer[i] = (byte) myChars[i];
        }

        fos.write(byteBuffer);
        fos.close();

        FileWriter fw = new FileWriter(file);
        fw.write(myChars);
        fw.write("Hello Another String");
        fw.close();
    }
}
