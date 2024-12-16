import java.io.File;

public class Demo1 {

    public static void main(String[] args) {
        File desktop  = new File(System.getProperty("user.home"), "Desktop");
        File test = new File(desktop,"test");
        File somethingText = new File(desktop, "something.txt");

        System.out.println("Desktop exists? " + desktop.exists());
        System.out.println("Desktop/test exists? " + test.exists());
        System.out.println("Desktop/something.txt exists? " + somethingText.exists());

        System.out.println("Is Desktop directory or file? "  +
                (desktop.isDirectory() ? "Directory" : "File"));
        System.out.println("Is Desktop/test directory or file? "  +
                (test.isDirectory() ? "Directory" : "File"));
        System.out.println("Is Desktop/something.txt directory or file? "  +
                (somethingText.isDirectory() ? "Directory" : "File"));
    }
}
