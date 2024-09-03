package com.data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamDemo {



        public static void main(String[] args) {
            String filePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\DataInputOutputStream-in-java\\src\\main\\resources\\employees.dat";

            // Writing employee data to the file using DataOutputStream
            try (FileOutputStream fos = new FileOutputStream(filePath);
                 DataOutputStream dos = new DataOutputStream(fos)) {

                // Employee 1 data
                dos.writeUTF("John Doe");
                dos.writeInt(30);
                dos.writeDouble(55000.75);
                dos.writeBoolean(true);  // Married

                // Employee 2 data
                dos.writeUTF("Jane Smith");
                dos.writeInt(25);
                dos.writeDouble(48000.50);
                dos.writeBoolean(false); // Single

                System.out.println("Employee data written to file.");

            } catch (IOException e) {
                e.printStackTrace();
            }

            // Reading employee data from the file using DataInputStream
            try (FileInputStream fis = new FileInputStream(filePath);
                 DataInputStream dis = new DataInputStream(fis)) {

                // Read and print Employee 1 data
                String name1 = dis.readUTF();
                int age1 = dis.readInt();
                double salary1 = dis.readDouble();
                boolean isMarried1 = dis.readBoolean();

                System.out.println("Employee 1:");
                System.out.println("Name: " + name1);
                System.out.println("Age: " + age1);
                System.out.println("Salary: " + salary1);
                System.out.println("Married: " + isMarried1);

                // Read and print Employee 2 data
                String name2 = dis.readUTF();
                int age2 = dis.readInt();
                double salary2 = dis.readDouble();
                boolean isMarried2 = dis.readBoolean();

                System.out.println("Employee 2:");
                System.out.println("Name: " + name2);
                System.out.println("Age: " + age2);
                System.out.println("Salary: " + salary2);
                System.out.println("Married: " + isMarried2);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
