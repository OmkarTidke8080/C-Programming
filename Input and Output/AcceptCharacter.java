// Accepting a single character from keyboard

import java.io.*;

public class AcceptCharacter
{
    public static void main(String arg[]) throws IOException
    {
        // create buffered reader object to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for char and read it
        System.out.println("Enter Character : ");
        char ch = (char)br.read();
         
        // Display the character
        System.out.println("You enetered : "+ ch);

    }     
}
