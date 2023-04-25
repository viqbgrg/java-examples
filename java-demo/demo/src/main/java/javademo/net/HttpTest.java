package javademo.net;

import org.junit.jupiter.api.Test;

import javax.net.ssl.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class HttpTest {

    @Test
    public void tcp() {
        long l = System.currentTimeMillis();
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("39.156.66.10", 443), 2000);
            l = System.currentTimeMillis() - l;
            System.out.println(l);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void http() {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("129.146.240.20", 10244), 2000);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("GET / HTTP/1.1\r\n");
            bufferedWriter.write("Host: 129.146.240.20\r\n");
            //bufferedWriter.write("Connection: close\r\n");
            bufferedWriter.write("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36\r\n");
            bufferedWriter.write("\r\n");
            bufferedWriter.flush();
            BufferedInputStream streamReader = new BufferedInputStream(inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamReader, "utf-8"));
            String line = null;
            while ((line = bufferedReader.readLine()).length() != 0) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void url() throws IOException {
        URL url = new URL("");
        Object content = url.getContent();
        System.out.println(content.toString());
    }

    private static String readAsString(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, bytesRead);
        }
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }

    @Test
    void https() throws MalformedURLException {
        SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        URL url = new URL("https://www.baidu.com");
        try (SSLSocket sslSocket = (SSLSocket) sslsocketfactory.createSocket("39.156.66.10", 443)) {
            SNIHostName serverName = new SNIHostName(url.getHost());
            List<SNIServerName> serverNames = new ArrayList<>(1);
            serverNames.add(serverName);
            SSLParameters params = sslSocket.getSSLParameters();
            params.setServerNames(serverNames);
            sslSocket.setSSLParameters(params);
            OutputStream outputStream = sslSocket.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("GET " + (url.getPath().equals("") ? "/" : url.getPath()) + " HTTP/1.1\r\n");
            bufferedWriter.write("Host: " + url.getHost() + "\r\n");
            bufferedWriter.write("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36\r\n");
            bufferedWriter.write("\r\n");
            bufferedWriter.flush();
            BufferedInputStream streamReader = new BufferedInputStream(sslSocket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamReader, "utf-8"));
            String line = null;
            while ((line = bufferedReader.readLine()).length() != 0) {
                System.out.println(line);
            }
            //code to read the post payload data
            StringBuilder payload = new StringBuilder(8096);
            boolean loop = true;
            while (loop) {
                if (bufferedReader.ready()) {
                    int i = 0;
                    while (i != -1) {
                        i = bufferedReader.read();
                        payload.append((char) i);
                    }
                    loop = false;
                }
            }
            System.out.println("Payload data is: " + payload);
            bufferedReader.close();
            bufferedWriter.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void test2() throws IOException {
        SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory
                .getDefault();
        URL myURL = new URL("https://www.baidu.com");
        SSLSocket sslSocket = (SSLSocket) sslsocketfactory.createSocket("39.156.66.10", 443);
        String str[] = "39.156.66.10".split("\\.");
        byte[] b = new byte[str.length];
        for (int i = 0, len = str.length; i < len; i++) {
            b[i] = (byte) (Integer.parseInt(str[i], 10));
        }
        HttpsURLConnection httpUrlConn = (HttpsURLConnection) myURL.openConnection();
        httpUrlConn.setRequestMethod("GET");
        httpUrlConn.setDoOutput(true);
        httpUrlConn.setConnectTimeout(2000);
        httpUrlConn.setReadTimeout(2000);
        //httpUrlConn.connect();
        InputStream inputStream = httpUrlConn.getInputStream();
        System.out.println(readAsString(inputStream));
    }
}
