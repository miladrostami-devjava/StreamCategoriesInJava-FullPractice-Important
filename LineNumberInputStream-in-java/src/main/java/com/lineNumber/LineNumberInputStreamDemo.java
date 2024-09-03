package com.lineNumber;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;


public class LineNumberInputStreamDemo {



        public static void main(String[] args) {
            String filePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\LineNumberInputStream-in-java\\src\\main\\resources\\log.txt";

            try (FileInputStream fis = new FileInputStream(filePath);
                 LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(fis)) {

                int data;
                StringBuilder line = new StringBuilder();

                while ((data = lineNumberInputStream.read()) != -1) {
                    char character = (char) data;

                    // If we reach the end of a line, print it
                    if (character == '\n') {
                        System.out.println("Line " + lineNumberInputStream.getLineNumber() + ": " + line);
                        line.setLength(0); // Clear the StringBuilder for the next line
                    } else {
                        line.append(character); // Append the character to the current line
                    }
                }

                // Print the last line if it doesn't end with '\n'
                if (line.length() > 0) {
                    System.out.println("Line " + lineNumberInputStream.getLineNumber() + ": " + line);
                }

            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }
