// Accept a string from user and chck whther it is palindrome or not

import java.io.*;

public class Palindrome
{
    public static void main(String args[]) throws IOException
    {
        // crete buffrered object to accept data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string : ");
        String str = br.readLine();

        // store a copy of original string in the tempoaray variable
        String temp = str;

        // convert string into string buffer
        StringBuffer sb = new StringBuffer(str);

        // reverse the string
        sb.reverse();

        // convert sy=tring buffer into a string
        str = sb.toString();

        // compare available  original string
        if(temp.equalsIgnoreCase(str)) 
        {
            System.out.println("It is palindome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
    
}
