package javademo.net;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class HttpTest {

    @Test
    public void http() {
        long l = System.currentTimeMillis();
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("39.156.66.10", 443), 2000);
            l = System.currentTimeMillis() - l;
            System.out.println(l);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
