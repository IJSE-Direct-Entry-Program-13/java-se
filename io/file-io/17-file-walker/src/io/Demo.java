package io;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File targetDir = new File("./target");
        listContent(targetDir);
        targetDir.delete();
    }

    static void listContent(File directory) {
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                listContent(file);
                file.delete();
            }else {
                System.out.println(file.getAbsolutePath());
                file.delete();
            }
        }
    }
}
