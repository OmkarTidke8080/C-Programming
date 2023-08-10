// Write a program that accepst file or directory name from command line arguments and pass the file or directory name at command line to this program . program should display properties of file

import java.io.IOException;
import java.io.*;

public class FileInfo
{
    public static void main(String[] args) throws IOException
    {
        String name = args[0];

        File f = new File(name);

        System.out.println("File Name = "+f.getName());
        System.out.println("Path = "+f.getPath());
        System.out.println("Absolute Path = "+f.getAbsolutePath());
        System.out.println("Parent = "+f.getParent());
        System.out.println("Exists = "+f.exists());
        if(f.exists())
        {
            System.out.println("Is Writable = "+f.canWrite());
            System.out.println("Is readable = "+f.canRead());
            System.out.println("Is a dirctory = "+f.isDirectory());
            System.out.println("File Size in bytes = "+f.length());
        }

    }
    
}