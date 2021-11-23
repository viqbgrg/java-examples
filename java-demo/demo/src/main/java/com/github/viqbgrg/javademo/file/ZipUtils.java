package com.github.viqbgrg.javademo.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author hhj
 */
public class ZipUtils {
    /**
     * 使用输入流,创建一个 zip 文件
     */
    public static void create() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Users/hhj/Desktop/compressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        ZipEntry entry = new ZipEntry("1234/");
        zipOut.putNextEntry(entry);
        zipOut.close();
        fos.close();
    }
}
