// Write a program which accepts a file name from command line arguments and displays the number of characters, word, and lines in the file name

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Program14
{
    public static void main(String[] args) throws IOException
    {
       int ch;
       boolean prev = true;

       // counters
       int char_count = 0;
       int word_count = 0;
       int line_count = 0;
       
       // attch file from arg[0] to filestream 
       FileInputStream fis = new FileInputStream(args[0]);

       while( (ch = fis.read()) != -1)
       {
            if(ch != ' ') ++char_count;
            if(!prev && ch == ' ') ++word_count;

            if(ch == ' ') prev = true;
            else
            prev = false;

            if(ch == '\n') ++line_count;
       }

       char_count = char_count - line_count * 2;
       word_count = word_count + line_count;

       System.out.println("No of characters  = "+char_count);
       System.out.println("No of words = "+word_count);
       System.out.println("No of lines = "+line_count);

       fis.close();
    }
    
}
