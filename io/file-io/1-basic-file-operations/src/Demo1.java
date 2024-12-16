import java.io.File;

public class Demo1 {

    public static void main(String[] args) {
        File pointer1 = new File("/home/ranjith-suranga/Desktop/test");
        System.out.println(pointer1.exists());

        File pointer2 = new File("/home/ranjith-suranga/Desktop/test2");
        System.out.println(pointer2.exists());

        File pointer3 = new File("");
        System.out.println(pointer3.getAbsolutePath());

        File pointer4 = new File("hello/ijse/dep");
        System.out.println(pointer4.getAbsolutePath());
    }
}
