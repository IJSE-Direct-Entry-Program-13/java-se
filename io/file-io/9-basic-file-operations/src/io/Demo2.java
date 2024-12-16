package io;

import java.io.File;

public class Demo2 {

    public static void main(String[] args) {
        File desktopDir = new File(System.getProperty("user.home"), "Desktop");
        File pointer = new File(new File(new File(desktopDir, "ijse"), "dep"), "dep-13");
//        File pointer = new File(desktopDir, "dep-13");
        System.out.println("Created? " + pointer.mkdirs());
    }
}
