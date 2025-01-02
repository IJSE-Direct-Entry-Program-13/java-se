package b;

import shared.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("customer.db");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Customer customer = (Customer) ois.readObject();

        ois.close();

        System.out.println(customer);
    }
}
