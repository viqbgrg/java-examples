package com.github.viqbgrg.javademo;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ExecTest {

    @Test
    void exec() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ping", "119.29.29.29");
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();
        StringBuilder sb = new StringBuilder();
        String line = null;
        OutputStream writeTo = process.getOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF8"));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            sb.append(line);
            if (line.contains("完整测速")) {
                writeTo.write('\n');
                writeTo.flush();
                writeTo.close();
            }
        }
        System.out.println(sb);
    }

    @Test
    void test1() throws IOException, InterruptedException {
        ProcessBuilder p = new ProcessBuilder("ping", "119.29.29.29");
        p.redirectErrorStream(true);
        Process process = p.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            sb.append(line + System.getProperty("line.separator"));
        }
        process.waitFor();
        System.out.println(sb.toString());
    }


}
