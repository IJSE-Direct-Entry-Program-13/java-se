package a;

import shared.Customer;
import shared.Name;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {
        Name name = new Name("Kasun", "Sampath", "Lakmal");
        Customer customer = new Customer("C001", name, "Panadura");

        File file = new File("customer.db");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(customer);

        oos.close();
        System.out.println("Customer has been serialized");
    }
}
