import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("Sohan_2.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);
    }
}
