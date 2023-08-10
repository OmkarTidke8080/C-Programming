// Write a program to read data from file "myfile.txt" using FileInputStream and display it on the monitor

import java.io.*;

public class Program3
{
    public static void main(String[] args) throws IOException
    {
       FileInputStream fin = new FileInputStream("myfile.txt");

       System.out.println("file contents : ");

       // read characters from fileInputstream and write a them to monitor
       int ch;

       while( (ch = fin.read()) != -1)
       {
         System.out.println((char)ch);
       }

       fin.close();
        
    }
    
}
