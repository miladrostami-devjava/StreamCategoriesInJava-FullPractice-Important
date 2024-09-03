package com.piped;

import java.io.IOException;
import java.io.PipedInputStream;

public class Consumer implements Runnable {
    private PipedInputStream inputStream;

    public Consumer(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {

        byte[] buffer = new byte[1024];
        try {
            int bytesRead = inputStream.read(buffer);
            String message = new String(buffer,0,bytesRead);
            System.out.println("Consumer Received :"  +message);
            inputStream.close();
        } catch (IOException e) {
e.printStackTrace();
        }


    }
}
