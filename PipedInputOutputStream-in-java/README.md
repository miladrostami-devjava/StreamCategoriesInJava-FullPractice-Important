# PipedInputStream and PipedOutputStream in java

## Description 
Suppose that in a multi-threaded program we need to 
transfer data between two threads directly. For example, 
one thread acts as a data producer and another thread processes data as a consumer.
Using PipedOutputStream and PipedInputStream provides a
simple and efficient way to communicate between these two threads.