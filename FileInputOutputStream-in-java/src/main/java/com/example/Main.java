package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String inputFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\FileInputOutputStream-in-java\\src\\main\\resources\\inputtext.txt";
        String outputFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\FileInputOutputStream-in-java\\src\\main\\resources\\outputtext.txt";

        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
// step-1 : Reading data from input file using FileInputStream
            int data ;
            while ((data = fis.read()) != -1){
                fos.write(Character.toUpperCase(data));
            }
            System.out.println("Data has been successfully written by :" + outputFilePath);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}