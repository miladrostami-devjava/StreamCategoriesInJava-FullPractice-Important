package com.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Producer implements Runnable{

    private PipedOutputStream outputStream;


    public Producer(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
String message = "java developer in 2024 year , spring framework is important framework in java web";
        System.out.println("Producer message :" + message);

        try {
            outputStream.write(message.getBytes());
            outputStream.close();
        } catch (IOException e) {
       e.printStackTrace();
        }
    }
}
