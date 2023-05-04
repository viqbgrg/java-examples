package com.github.viqbgrg.javademo.net;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class ProxyTest {

    @Test
    void test() throws IOException {
        InetSocketAddress socketAddress=new InetSocketAddress(
                InetAddress.getByName("127.0.0.1"),1081);

        Proxy proxy=new Proxy(Proxy.Type.HTTP,socketAddress);

        URL url= new URL("http://119.29.29.29/d?dn=www.baidu.com");

        /*测试是否能够打开连接，获得输入流，连接方式是直连方式*/
//		InputStream inputStream=url.openConnection().getInputStream();

        /*下面用代理的方式进行连接，需要构造Proxy对象*/
        InputStream input=url.openConnection(proxy).getInputStream();

        if(input !=null){
            System.out.println("Connectioned");
        }
    }
}
