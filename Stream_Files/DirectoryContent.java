// Write a program to accept a directory name and display its contents into an array

import java.io.IOException;
import java.util.*;
import java.io.*;

public class DirectoryContent
{
    public static void main(String[] args) throws IOException
    {
         Scanner sc= new Scanner(System.in);

       

         System.out.println("Enter Dir Name : ");
         String DirName = sc.next();

         File f = new File(DirName);

         if(f.exists())
         {
            String arr[] = f.list();

            int n = arr.length;

            for(int i = 0; i < n; i++)
            {
                System.out.println(arr[i]);

                File f1 = new File(arr[i]);

                if(f1.isFile())
                {
                    System.out.println(" Is a file");
                }
                else if(f1.isDirectory())
                {
                    System.out.println("Is a directory");
                }
            }
            System.out.println("No of entries in the directory = "+n);
         }
         else
         {
            System.out.println("Directory does not exist...");
         }
    }
    
}
