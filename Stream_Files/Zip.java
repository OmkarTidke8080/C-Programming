// write a program to compress the data in a file using DeflatorOutPutStream.

import java.io.*;
import java.util.zip.*;

public class Zip
{
    public static void main(String[] args) throws IOException
    {
        // attach the original file to fileInputStream for reading data
        FileInputStream fis = new FileInputStream("myfile.txt");

        // attch the compressed file to FileOutPutstream
        FileOutputStream fos = new FileOutputStream("myfile2.txt");

        // attch fileoutputstream to defaltor output stream
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        // read data from fileinputstream
        int data;

        while((data = fis.read()) != -1)
        {
            dos.write(data);
        }

        fis.close();
        dos.close();
    }
    
}
