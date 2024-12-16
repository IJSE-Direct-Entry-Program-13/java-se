import java.io.File;

public class MyApp {

    public static void main(String[] args) {
        File pointer1 = new File("");
        System.out.println(pointer1.getAbsolutePath());

        File pointer2 = new File("hello");
        System.out.println(pointer2.getAbsolutePath());
    }
}
