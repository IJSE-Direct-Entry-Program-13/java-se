package a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo1 {

    public static void main(String[] args) {
        File file = new File("./hello-io.txt");
        try {
            System.out.println("Created? " + file.createNewFile());
            FileOutputStream fos = new FileOutputStream(file, true);
//            String str = "Hello File IO";
//            byte[] strBytes = str.getBytes();
//            byte[] bytes = {65,66,67,68,69,70,71,72};
//            fos.write(strBytes);
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.flush();
            fos.write(68);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
