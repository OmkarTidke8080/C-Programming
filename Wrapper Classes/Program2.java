// Write a program which shows the use f Bytes class objects

import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Program2
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // accept a byte number as String 1
        System.out.println("Enter a byte no : ");
        String s1 = br.readLine();

        // create a byte object b1 using s1

        Byte b1 = new Byte(s1);

        // Accept another string as s2 
        System.out.println("Enter a byte no : ");
        String s2 = br.readLine();

        // create a byte object b2 using s2
        Byte b2 = new Byte(s2);

        // Compare both the strings object contents

        int n = b1.compareTo(b2);

        if(n == 0)
        {
            System.out.println("Both types are same");
        }
        else if(n < 0)
        {
            System.out.println(b1+" is less");
        }
        else
        {
            System.out.println(b2 + " is less");
        }

    }
    
}
