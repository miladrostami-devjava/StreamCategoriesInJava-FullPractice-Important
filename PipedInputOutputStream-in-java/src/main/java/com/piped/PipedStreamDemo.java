package com.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

    public static void main(String[] args){
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = null;
        try {
            inputStream = new PipedInputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread producerThread = new Thread(new Producer(outputStream));
        Thread consumerThread = new Thread(new Consumer(inputStream));

        producerThread.start();
        consumerThread.start();

      try {
          producerThread.join();
          consumerThread.join();
      }catch (InterruptedException exception ){
exception.printStackTrace();
        }


    }
}
