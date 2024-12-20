package buffers;

import java.nio.CharBuffer;

public class Demo2 {

    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.put('A');
        buffer.put('B');
        buffer.put('C');
        System.out.println(buffer.position());  //
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        buffer.flip();
        System.out.println("===========");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
    }
}
