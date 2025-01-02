package b;

import shared.Bottom;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("last.db");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Bottom bottom = (Bottom) ois.readObject();

        ois.close();

        System.out.println(bottom);
    }
}
