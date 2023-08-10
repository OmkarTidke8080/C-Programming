// write a program to read string by string from a text file using BufferedReader and fileReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Program8
{
    public static void main(String[] args) throws IOException
    {
        String str;

        // connect filereader to text file
        FileReader fr = new FileReader("stringfile");

        // connect BufferedReader to FileReader
        BufferedReader br = new BufferedReader(fr);

        while( (str = br.readLine()) != null)
        {
            System.out.println(str);
        }

        // close the file
        fr.close();


    }
    
}
