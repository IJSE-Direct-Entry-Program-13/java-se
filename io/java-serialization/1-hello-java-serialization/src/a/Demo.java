package a;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws IOException {
        int[] numbers = {10, 20, 30, 40, 50};
        ObjectOutputStream oos = new ObjectOutputStream(System.out);
        oos.writeObject(numbers);
        oos.close();
    }
}
