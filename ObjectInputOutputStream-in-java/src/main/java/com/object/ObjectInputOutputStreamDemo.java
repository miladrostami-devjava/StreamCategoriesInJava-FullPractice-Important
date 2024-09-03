package com.object;

import java.io.*;

public class ObjectInputOutputStreamDemo {


    public static void main(String[] args) {

String filePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\Stream-in-java-devloper\\ObjectInputOutputStream-in-java\\src\\main\\resources\\studens.ser";
// Step 1: Save students' information in the file
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
Student student1 = new Student(1,"ali",14.3,"ali@gmail.com","shiraz");
Student student2 = new Student(2,"alireza",18.6,"alireza@gmail.com","shiraz");
Student student3 = new Student(3,"aliasghar",16.66,"aliasghar@gmail.com","tehran");
Student student4 = new Student(4,"alisasber",18.5,"alisasber@gmail.com","tabriz");
Student student5 = new Student(5,"alishir",19.98,"alishir@gmail.com","babel");
Student student6 = new Student(6,"mirza",15.55,"mirza@gmail.com","tehran");

oos.writeObject(student1);
oos.writeObject(student2);
oos.writeObject(student3);
oos.writeObject(student4);
oos.writeObject(student5);
oos.writeObject(student6);
    System.out.println("students have been serialized and save in : " + filePath);
} catch (IOException e) {
e.printStackTrace();
}

// Step 2: Retrieving student information from the file

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            Student deserializedStudent1 = (Student) ois.readObject();
            Student deserializedStudent2 = (Student) ois.readObject();
            Student deserializedStudent3 = (Student) ois.readObject();
            Student deserializedStudent4 = (Student) ois.readObject();
            Student deserializedStudent5 = (Student) ois.readObject();
            Student deserializedStudent6 = (Student) ois.readObject();

            System.out.println("Deserialized Students :");
            System.out.println(deserializedStudent1);
            System.out.println(deserializedStudent2);
            System.out.println(deserializedStudent3);
            System.out.println(deserializedStudent4);
            System.out.println(deserializedStudent5);
            System.out.println(deserializedStudent6);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
