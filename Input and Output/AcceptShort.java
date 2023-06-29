// Accept a shot value from user

import java.io.*;

public class AcceptShort
{
    public static void main(String arg[]) throws IOException
    {
        // create bufferes reader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Acceprt short value from user
        System.out.println("Enter short value : ");
        Short num = Short.parseShort(br.readLine());

        // Display out in screen
        System.out.println("You entered value : "+ num);
    }
    
}
