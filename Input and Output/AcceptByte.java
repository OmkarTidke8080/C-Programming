// Write a program to accept a byte value from user

import java.io.*;

public class AcceptByte
{
    public static void main(String ag[]) throws IOException
    {
        // create buffered reader Object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept a byte value from user
        System.out.println("Enter a byte value : ");
        Byte b = Byte.parseByte(br.readLine());

        // display output on screen
        System.out.println("You entered value : "+ b);

    }
    
}
