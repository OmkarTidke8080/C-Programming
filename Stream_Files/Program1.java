// Write a program which shows how to read data from keyboard and write it to myfile.txt

import java.util.*;
import java.io.*;

public class Program1
{
    public static void main(String args[]) throws Exception
    {
        // Attach keyboard to data input stream
       DataInputStream dis = new DataInputStream(System.in);

       // attach myfile to fileoutputstream
       FileOutputStream fout = new FileOutputStream("myfile.txt");

       System.out.println("Enter the data  (@ at the end) :  ");
       
       char ch;

       // read characters from dis into ch. then write them into fout.
       // repeat this as long as read character is not at @
       while( (ch = (char)dis.read()) != '@')
       {
         fout.write(ch);
       }

       fout.close();
    }
}