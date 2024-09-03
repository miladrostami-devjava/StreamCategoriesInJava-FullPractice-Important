package com.stringbuffer;

import java.io.IOException;
import java.io.StringBufferInputStream;

public class StringBufferInputStreamDemo {

    public static void main(String[] args) {

        String text = "java , spring , security , web , http , session , batch";
        try(StringBufferInputStream sbis = new StringBufferInputStream(text)){
            int data ;
            boolean inWord = false;
            int count = 0;

            while ((data = sbis.read()) != -1){
                char character = (char) data;
            if (Character.isLetterOrDigit(character)){
                if (!inWord){
                    inWord = true;
                 count ++;
                }else {
                    inWord = false;
                }
            }
            }
            System.out.println("Number of count : " + count);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
