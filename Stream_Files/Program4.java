// Write a program to read data from file "myfile.txt" using FileInputStream and display it on the monitor
// imporived version

import java.io.*;

public class Program4
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter the file name : ");
       String fname = br.readLine();

       FileInputStream fin = null;

       try
       {
          fin = new FileInputStream(fname);
       }
       catch(FileNotFoundException fnf)
       {
         System.out.println("FIle Not found...");
         return ;
       }

       // attach FileOutputStream to BufferedInputStream
       BufferedInputStream bin = new BufferedInputStream(fin);


       System.out.println("file contents : ");

       // read characters from fileInputstream and write a them to monitor
       int ch;

       while((ch = bin.read()) != -1)
       {
         System.out.println((char)ch);
       }

       bin.close();
        
    }
    
}
