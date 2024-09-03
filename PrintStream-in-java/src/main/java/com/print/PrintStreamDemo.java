package com.print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Log orders using PrintStream
 */
public class PrintStreamDemo {


    public static void main(String[] args) {
        String logFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\PrintStream-in-java\\src\\main\\resources\\orders.log";

        try (FileOutputStream fos = new FileOutputStream(logFilePath, true);
             PrintStream logStream = new PrintStream(fos)) {

            // Logging new order details
            logStream.println("New Order Received:");
            logStream.println("Order ID: 12345");
            logStream.println("Customer: John Doe");
            logStream.println("Product: Laptop");
            logStream.println("Quantity: 2");
            logStream.println("Total Price: $2000");
            logStream.println("Status: Processing");
            logStream.println("-----------------------------");

            System.out.println("Order details have been logged successfully.");

        } catch (IOException e) {
            System.err.println("Error: Log file could not be found or created.");
        }

        // Logging an error using System.err, which is a PrintStream by default
        try {
            // Simulating an error
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero occurred in order processing.");
        }
    }
}

