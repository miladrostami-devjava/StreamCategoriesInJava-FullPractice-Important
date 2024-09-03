# BufferedInputStream and BufferedOutputStream in java

## Description

Suppose we have a Java program that needs to read 
or write a large amount of data from a file.
Input/output (I/O) operations without buffering can 
be time-consuming and suboptimal, especially when one 
byte is read or written at a time. 
To increase efficiency and reduce the number of direct
accesses to the file system, we use BufferedInputStream and BufferedOutputStream.