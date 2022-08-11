package com.github.viqbgrg.javademo.file;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class InputStreamTest {

    @Test
    void read() throws IOException {
        byte[] bs = new byte[31902];
        RandomAccessFile raf = new RandomAccessFile("E://subtlte/tv/g5V/v7MPmdChBh", "r");
        raf.seek(40960);
        raf.read(bs);
        System.out.println(bs.length);
    }
}
