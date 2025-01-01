import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("C001", "Kasun", "Galle");

        File file = new File("my-file.dep");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(customer);

        oos.close();
    }
}
