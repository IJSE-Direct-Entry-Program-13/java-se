package io;

import java.io.File;

public class Demo3 {

    public static void main(String[] args) throws InterruptedException {
        File exp = new File("exp");
        //System.out.println("Deleted? " + exp.delete());
        exp.deleteOnExit();
        System.out.println("Deleted?");
        Thread.sleep(5000);
        System.out.println("Okay, bye");
    }
}
