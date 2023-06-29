// Write a program to accept a double value from user

import java.io.*;

public class AcceptDouble
{
    public static void main(String ard[]) throws IOException
    {
        // create buffered reader Object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept a doublue value from user
        System.out.println("Enter a double value : ");
        double num = Double.parseDouble(br.readLine());

        // Display Output on screen
        System.out.println("You entered double value : "+ num);
    }   
}
