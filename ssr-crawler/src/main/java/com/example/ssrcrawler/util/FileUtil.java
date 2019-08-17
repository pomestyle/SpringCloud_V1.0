package com.example.ssrcrawler.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:
 * @author: Administrator
 * @create: 2019-08-17 17:31
 **/
public class FileUtil {


    public static String fileReader(FileReader reader) throws IOException {
        char b[] = new char[1024];
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while ((i = reader.read(b)) != -1) {
            stringBuilder.append(reader.read(b, 0, i));
        }

        return new String(b);
    }


    /**
     * 缓冲区读取字符
     *
     * @param reader
     * @param writer
     * @throws IOException
     */
    public static void copyFile(FileReader reader, FileWriter writer) throws IOException {
        char b[] = new char[1024];
        int i = 0;
        while ((i = reader.read(b)) != -1) {
            writer.write(b);
        }
        writer.flush();

        reader.close();
        writer.close();
    }


    public static void writeFile(String str, String path) throws IOException {

        FileWriter writer = new FileWriter(path);
        writer.write(str);
        writer.flush();
        writer.close();
    }


    static void copy03(FileReader reader, FileWriter writer) throws IOException {
        char b[] = new char[1024];
        int i = 0;
        while ((i = reader.read(b)) != -1) {
            writer.write(b, 0, i);
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
