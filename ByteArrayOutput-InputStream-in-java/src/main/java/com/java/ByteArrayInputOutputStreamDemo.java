package com.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStreamDemo {

    public static void main(String[] args) {

        String text = "java developer  , spring framework , \n spring boot with microservices" +
                ",\n java web, java core advances ,\n spring security";


        // step-1: Writing data to ByteArrayOutputStream
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            // convert string to byte
            baos.write(text.getBytes());
            // get to byte array
            byte[] bytes = baos.toByteArray();
            System.out.println(" original Byte Array :" + new String(bytes));

            // step-2 : Read data from ByteArrayInputStream
            try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)){
                int data ;
                ByteArrayOutputStream modifiedBaos = new ByteArrayOutputStream();
                while ((data = bais.read()) != -1){
                    modifiedBaos.write(Character.toUpperCase(data));
                }
                byte[] byteArrayModified = modifiedBaos.toByteArray();
                String modifiedText = new String(byteArrayModified);
                System.out.println("Modified text is :" + modifiedText);

            }




        } catch (IOException e) {
            System.out.println("You have a error!");
e.printStackTrace();        }


    }
}
