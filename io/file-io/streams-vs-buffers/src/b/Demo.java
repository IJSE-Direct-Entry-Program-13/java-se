package b;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Demo {

    public static void main(String[] args) throws Exception{
        File file = new File("io.txt");
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("Hello World".getBytes());
        bos.close();
    }
}
