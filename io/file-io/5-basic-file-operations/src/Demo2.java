import java.io.File;

public class Demo2 {

    public static void main(String[] args) {
        File appDir = new File(".");
        System.out.println(appDir.getAbsolutePath());

        System.out.println("Is this a directory?: " + appDir.isDirectory());
        if (appDir.isDirectory()) {
            String[] names = appDir.list();
            for (String name : names) {
                System.out.println(name);
            }

            File[] content = appDir.listFiles();
            for (File file : content) {
                System.out.println(file.getName() + " - " + (file.isDirectory() ? "Directory" : "File"));
            }
        }
    }
}
