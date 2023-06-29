// Accept a float value from user

import java.io.*;

public class AcceptFloat
{
    public static void main(String arg[]) throws IOException
    {
    // create a buffered reader object to accept a input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Accept a float value from user
    System.out.print("Enter a float value : ");
    float num = Float.parseFloat(br.readLine());

    // Display value on screen
    System.out.println("You entered float value : "+ num);
  
    }


    
}
