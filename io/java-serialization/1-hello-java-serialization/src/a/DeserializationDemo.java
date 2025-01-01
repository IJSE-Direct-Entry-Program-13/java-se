package a;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class DeserializationDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("buddhi.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        String[] names = (String[]) ois.readObject();
        ois.close();
        System.out.println(Arrays.toString(names));
    }
}
