package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("./.gitignore");
        FileChannel fc = FileChannel.open(path);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int read = fc.read(buffer);
            if (read == -1) break;
            System.out.println(new String(buffer.array(), 0, read));
        }
        fc.close();
    }
}
