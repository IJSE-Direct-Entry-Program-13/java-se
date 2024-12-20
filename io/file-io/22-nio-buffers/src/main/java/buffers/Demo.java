package buffers;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) throws Exception {
        Path path = Path.of("./nio.txt");
        System.out.println(Files.exists(path));

        FileChannel fc = FileChannel.open(path);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        System.out.println("Capacity: " + buffer.capacity());
        System.out.println("Limit: " + buffer.limit());
        System.out.println("Position: " + buffer.position());
//        buffer.mark();
        //buffer.limit(5);
        System.out.println("==============");
        int read = fc.read(buffer);
        System.out.println("Read: "  + read);
        System.out.println("Capacity: " + buffer.capacity());
        System.out.println("Limit: " + buffer.limit());
        System.out.println("Position: " + buffer.position());
//        System.out.println("Mark: " + buffer.mark());
        buffer.flip();
        System.out.println("==============");
        System.out.println("Capacity: " + buffer.capacity());
        System.out.println("Limit: " + buffer.limit());
        System.out.println("Position: " + buffer.position());
        fc.close();
    }
}
