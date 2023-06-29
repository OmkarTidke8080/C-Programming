// Write  a program to accept a integer from user

import java.io.*;

public class AcceptInteger
{
    public static void main(String arg[]) throws IOException
    {
        // create buffered reader object to accept input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept a integer from user
        System.out.println("Enter a Integer : ");
        int num = Integer.parseInt(br.readLine());

        // Display the string 
        System.out.println("Your entered integer is : " + num);
    
    
    }
    
}
