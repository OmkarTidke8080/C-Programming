// write a program to show how to read data from "text" file using FileReader

import java.io.*;

public class Program6
{
    public static void main(String[] args) throws IOException
    {
        // var
        int ch;

        // check if file exist or not
        FileReader fr = null;

        try
        {
            fr = new FileReader("text");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found...");
            return;
        }

        // read from filereader
        while( (ch = fr.read()) != -1)
        {
            System.out.println((char)ch);
        }

        fr.close();
    }
    
}
