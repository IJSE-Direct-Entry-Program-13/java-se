package io;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File firstFile = new File("test", "1.jpg");
        File secondFile = new File("test", "2.png");

        System.out.println("Deleted firstFile? " + firstFile.delete());
        System.out.println("Deleted secondFile? " + secondFile.delete());
    }
}
