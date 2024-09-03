package com.sequence;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class SequenceInputStreamDemo {

    public static void main(String[] args) {

        List<String> listFiles = new ArrayList<>();
        listFiles.add("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\SequenceInputStream-in-java\\src\\main\\resources\\file1.txt");
        listFiles.add("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\SequenceInputStream-in-java\\src\\main\\resources\\file2.txt");
        listFiles.add("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\SequenceInputStream-in-java\\src\\main\\resources\\file3.txt");

        Vector<InputStream> inputStreams = new Vector<>();

        try {
            for (String fileName : listFiles) {
                FileInputStream fis = new FileInputStream(fileName);
                inputStreams.add(fis);
            }
            Enumeration<InputStream> enumeration = inputStreams.elements();
            SequenceInputStream sis = new SequenceInputStream(enumeration);

            int data;
            while ((data = sis.read()) != -1) {
                System.out.println((char) data);
            }

            sis.close();
            for (InputStream in : inputStreams) {
                in.close();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
