// Write a program to unzip the file

import java.io.*;
import java.util.zip.*;

public class Unzip
{
    public static void main(String[] args) throws IOException
    {
        // attch input file to fileInputStream
        FileInputStream fis = new FileInputStream("myfile2.txt");

        // attach output file to fileOutputstream
        FileOutputStream fos = new FileOutputStream("myfile3.txt");

        //attch inflatorstream to fileinputstream for uncompress
        InflaterInputStream iis = new InflaterInputStream(fis);

        // read data from inflatorinputstream

        int data;
        while( (data = iis.read()) != -1)
        {
            fos.write(data);
        }

        fos.close();
        iis.close();
    }
}