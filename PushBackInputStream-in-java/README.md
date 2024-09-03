# PushBackInputStream in java
## Description :
Suppose you have a text file in which data is stored as follows:

Lines starting with # are treated as comments.
The actual data is after the comment lines and you want to process this data.
We want to write a program that ignores comment lines and only processes the actual data.
For this we use PushbackInputStream so that after reading a character, 
we can decide whether to consume or return it.