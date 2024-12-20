package a;

import java.io.*;
import java.nio.channels.Channels;

public class ReadDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("./.gitignore");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        File file1 = new File("./io.txt");
        FileWriter fw = new FileWriter(file1);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello World");
        bw.newLine();
        bw.write("Oh. now we can add a new line with newLine() method");
        bw.close();
    }
}
