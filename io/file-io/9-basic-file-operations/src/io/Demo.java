package io;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File testDir = new File(new File(System.getProperty("user.home"), "Desktop"), "test");
        for (int i = 0; i < 100; i++) {
            File newFolder = new File(testDir, "Folder-" + i);
            System.out.println(newFolder.getName() + " created? " + newFolder.mkdir());
        }
    }
}
