package b.c;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStream out = System.out;
        BufferedOutputStream bos = new BufferedOutputStream(out);
        bos.write("Hello".getBytes());
        bos.flush();
    }
}
