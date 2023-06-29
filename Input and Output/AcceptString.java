// Write a program to accept a string from user

import java.io.*;

public class AcceptString
{
    public static void main(String arg[]) throws IOException
    {
        // create buffered reader object to accept data from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask fro string and read it
        System.out.println("Enter a String : ");
        String str = br.readLine();

        // Display the string
        System.out.println("Your Entered string is : " + str);
    }
}
