package a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {
        String[] names = {"Kasun", "Nuwan", "Ruwan", "Upul"};

        File file = new File("dep13.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(names);

        oos.close();
    }
}
