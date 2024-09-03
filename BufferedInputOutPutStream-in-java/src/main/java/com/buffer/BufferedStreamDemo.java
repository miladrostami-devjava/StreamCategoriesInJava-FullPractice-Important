package com.buffer;

import java.io.*;

public class BufferedStreamDemo {


    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\BufferedInputOutPutStream-in-java\\src\\main\\resources\\sourceFile.txt";
        String destinationFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\BufferedInputOutPutStream-in-java\\src\\main\\resources\\destinationFile.txt";


        // Using BufferedInputStream to read from the source file
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(destinationFilePath);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // Buffer with a size of 1024 bytes
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Reading and writing data in chunks
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully using buffered streams.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
