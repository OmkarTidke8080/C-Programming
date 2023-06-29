// Writw a program which generates fibonnaci series

import java.io.*;
import java.lang.*;



public class Fibonacci
{
    public static void main(String arg[]) throws IOException
    {
        //create buffered aReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept input number
        System.out.println("How many fibonacci"); 
        int n = Integer.parseInt(br.readLine());

        // Take two first fibonacci series as 0  and 1
        long f1 = 0;
        long f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
       
        int count = 2;
        long f = f1 + f2;
        System.out.println(f);

        while(count < n)
        {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
            count++;
        }
    }

    
}
