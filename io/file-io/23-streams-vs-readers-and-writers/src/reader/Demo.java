package reader;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        File file = new File("./io.txt");

        FileInputStream fis = new FileInputStream(file);
        byte[] byteBuffer = new byte[fis.available()];
        fis.read(byteBuffer);
        for (int i = 0; i < byteBuffer.length; i++) {
            System.out.print((char) byteBuffer[i]);
        }
        fis.close();
        System.out.println();

        FileReader fr = new FileReader(file);
        char[] charBuffer = new char[(int)file.length()];
        fr.read(charBuffer);
        for (int i = 0; i < charBuffer.length; i++) {
            System.out.print(charBuffer[i]);
        }
        fr.close();
    }
}
