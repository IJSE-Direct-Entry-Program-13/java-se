package io;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File test = new File("test");
        if (test.isDirectory() && test.listFiles().length > 0) {
            for (File file : test.listFiles()) {
                file.delete();
            }
        }
        System.out.println("Deleted? " + test.delete());
    }
}
