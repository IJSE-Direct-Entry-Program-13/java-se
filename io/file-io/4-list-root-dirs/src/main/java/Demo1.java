import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Demo1 {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root.getAbsolutePath());
        }

        Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
        for (Path root : rootDirectories) {
            System.out.println(root);
        }
    }
}
