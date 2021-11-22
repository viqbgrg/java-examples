package com.github.viqbgrg.javademo.file;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

/**
 * @author hhj
 */
public class ZipUtils {
    /**
     * 使用输入流,创建一个 zip 文件
     */
    public static void create() throws IOException {
        FileOutputStream fos = new FileOutputStream("compressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileOutputStream fileToZip = new FileOutputStream("/1233/");
        byteArrayOutputStream.writeTo(fileToZip);

        zipOut.close();
        fileToZip.close();
        fos.close();
    }
}
