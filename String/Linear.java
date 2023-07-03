// Write a program to perform linear string Array

import java.io.*;
import java.util.Scanner;

public class Linear
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        // Ask How may strings 
        System.out.println("How many strings : ");
        int n = sc.nextInt();

        // create a string type array with size n
        String Arr[] = new String[n];

        // store strings into Arr
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("Enter String : ");
             Arr[i] = sc.nextLine();       
        }

        // accept a string to search 
        System.out.println("Enter string to search : ");
        String Search = sc.nextLine();

        // take a boolean variable
        boolean found = false;
        for(int i = 0; i < n; i++)
        {
            if(Search.equals(Arr[i]))
            {
                System.out.println("Found at position : "+ (i + 1));
                found = true;
            }
            
        }
         
         if(! found)
            {
                System.out.println("NOt found in the string");
            }

    }
    
}
