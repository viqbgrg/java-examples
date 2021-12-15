package javademo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {
    public void download() throws IOException {
        URL url = new URL("下载地址");
        URLConnection urlConnection = url.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(1080)));
        InputStream inputStream = urlConnection.getInputStream();


    }
}
