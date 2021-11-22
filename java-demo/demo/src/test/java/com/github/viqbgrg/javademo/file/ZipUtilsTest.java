package com.github.viqbgrg.javademo.file;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Slf4j
public class ZipUtilsTest {
    /**
     * 不生成文件,生成一个存在几个空文件夹的 zip 文件
     */
    @Test
    void test() throws IOException {
        ZipUtils.create();
    }

}
