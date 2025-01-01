package b;

import shared.Customer;
import shared.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("db.dep");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Customer c001 = (Customer) ois.readObject();
        Customer c002 = (Customer) ois.readObject();
        String str = (String) ois.readObject();
        Customer c003 = (Customer) ois.readObject();
        int[] nums = (int[]) ois.readObject();
        Student s001 = (Student) ois.readObject();

        ois.close();

        System.out.println(c001);
        System.out.println(c002);
        System.out.println(str);
        System.out.println(c003);
        System.out.println(Arrays.toString(nums));
        System.out.println(s001);
    }
}
