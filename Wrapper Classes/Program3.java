// Write a program to accept an integer number from keyboard and convert it into anothe number systems

import java.util.*;
import java.io.*;

public class Program3
{
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter an integer : ");
       String str = br.readLine();

       // convert string into int

       int i = Integer.parseInt(str);
       System.out.println("In Decimal : "+i);

       // conversion to binary
        str = Integer.toBinaryString(i);
        System.out.println("In Binary : "+str);

        // conversion to hexadecimal
        str = Integer.toHexString(i);
        System.out.println("In HexaDecimal : "+str);

        // conversion to octal
        str = Integer.toOctalString(i);
        System.out.println("In Octal : "+str);
        
    }
    
}
