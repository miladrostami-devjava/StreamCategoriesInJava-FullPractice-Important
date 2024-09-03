# FilterInputStream and FilterOutputStream in java

## Description
Suppose we have an application that needs simple encryption for 
text data before storing it in a file and decrypting it after 
reading from the file. In this scenario, we use FilterOutputStream
and FilterInputStream to create a filter layer that encrypts data on
write and decrypts it on read.