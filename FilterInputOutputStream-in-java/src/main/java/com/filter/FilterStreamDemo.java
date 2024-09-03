package com.filter;

import java.io.*;

public class FilterStreamDemo {

    public static void main(String[] args) {

        String message = "java dev";
        String filePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\FilterInputOutputStream-in-java\\src\\main\\resources\\message_encrypted.txt";


        try(FileOutputStream fos = new FileOutputStream(filePath) ;
        EncryptionOutputStream eos = new EncryptionOutputStream(fos)) {
            eos.write(message.getBytes());
            System.out.println("message written to file with encryption !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(filePath);
        DecryptionInputStream dis = new DecryptionInputStream(fis)){
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer);
            String decryptionMessage = new String(buffer,0,bytesRead);
            System.out.println("Decryption message read file from :" + decryptionMessage);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
