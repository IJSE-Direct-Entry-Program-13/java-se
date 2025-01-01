package a;

import shared.Customer;
import shared.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {
        Customer c001 = new Customer("C001", "Buddhi", "011-1234567");
        Customer c002 = new Customer("C002", "Nuwan", "033-1234567");
        Customer c003 = new Customer("C003", "Upul", "044-1234567");

        File file = new File("db.dep");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c001);
        oos.writeObject(c002);
        oos.writeObject("I am a string");
        oos.writeObject(c003);
        oos.writeObject(new int[]{50,30,20,10});
        oos.writeObject(new Student("S001", "Kasun", "IJSE"));
        oos.close();
    }
}
