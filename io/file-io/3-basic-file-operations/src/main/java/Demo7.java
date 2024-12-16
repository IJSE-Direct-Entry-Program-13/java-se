import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        File userHome = new File(System.getProperty("user.home"));
        File desktop = new File(userHome , "Desktop");
        File desktopAbc = new File(desktop, "abc");
        File desktopEdf = new File(desktop, "edf");
        File documentsAbc = new File(new File(userHome , "Documents"), "abc");

        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        File depDir = new File(tempDir, "dep");
        File phase1 = new File(new File(depDir, "13"), "phase-1");
        System.out.println(phase1);

        // tmp -> ijse -> cmjd -> final -> something.txt
        File pointer = new File(new File(new File(new File(tempDir, "ijse"), "cmjd"), "final"), "something.txt");
        System.out.println(pointer);
    }
}
