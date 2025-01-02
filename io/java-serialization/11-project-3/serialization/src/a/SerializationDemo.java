package a;

import shared.Bottom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {
        Bottom bottom = new Bottom(50);
        System.out.println(bottom);

        File file = new File("last.db");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(bottom);

        oos.close();
        System.out.println("Bottom has been serialized successfully");
    }
}
