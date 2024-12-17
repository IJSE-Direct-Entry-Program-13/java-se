package a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo3 {

    public static void main(String[] args) {
        File file = new File("./image.jpg");
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            byte[] bytes = {65,66,67,68,69,70,71,72};
            fos.write(bytes);
//            fos.write(65);
//            fos.write(66);
//            fos.write(67);
//            fos.write(68);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
