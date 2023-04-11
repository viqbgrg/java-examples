package javademo.net;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class HttpTest {

    @Test
    public void http() throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("", 443), 2000);

    }
}
