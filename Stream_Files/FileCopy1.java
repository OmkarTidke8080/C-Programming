// write a program to read the contents of input file and write them into an output file. the input file neads to be already available

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import javax.sound.midi.Soundbank;

public class FileCopy1
{
    public static void main(String[] args) throws IOException
    {
      int ch;

      // open args[0] file to read the contents
      try
      {
      FileInputStream fis = new FileInputStream(args[0]);
      FileOutputStream fos = new FileOutputStream(args[1]);

      while( (ch = fis.read()) != -1)
      {
        fos.write(ch);
      }
      System.out.println(" 1 File copied...");
    }
      catch(Exception e)
      {

      }

      
        
    }
    
}
