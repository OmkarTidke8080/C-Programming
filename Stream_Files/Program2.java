// Write a program to improce efficiency of writing data into a file using BufferedOutPutStream

import java.io.*;

public class Program2
{
    public static void main(String[] args) throws IOException
    {
        // attach keyboard to data inout stream
        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fout = new FileOutputStream("myfile1.txt",true);

        BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
        System.out.println("Enter text (@ at the end) : ");

        char ch;

        while( (ch = (char)dis.read()) != '@')
        {
            bout.write(ch);
        }

        bout.close();
    }
    
}
