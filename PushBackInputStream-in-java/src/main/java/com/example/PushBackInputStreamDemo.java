package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\PushBackInputStream-in-java\\src\\main\\resources\\file.txt");
            PushbackInputStream pbis = new PushbackInputStream(fis,1);
        ) {
            int data ;
            boolean isComment = false;

            while ((data = pbis.read()) != -1){
                if (data == '#'){
isComment = true;
                }
                if (isComment){
                    if (data == '\n'){
                        isComment = false;
                    }
                    continue;
                }
                System.out.println((char) data);
            }




        } catch (IOException e) {
            System.out.println("IoException is :" + e.getMessage());
            throw new RuntimeException(e);
        } ;
    }
}
