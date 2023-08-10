// Write a program to store string by string into a text file

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Program7
{
    public static void main(String[] args) throws IOException
    {
        // to read string from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        // open the file for writing
        FileWriter fw = new FileWriter("stringfile");

        System.out.println("Enter data : ");
        while( !(str = br.readLine()).equals("exit"))
        {
            fw.write(str+'\n');
        }
    
        fw.close();
        
    }
}