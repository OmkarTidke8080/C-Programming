// Sort a group of integers into ascending order

import java.io.*;


public class Sort
{
    public static void main(String arg[]) throws NumberFormatException, IOException
    {
        // to accept data from user use bufferes reader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // create a int type Array

        System.out.print("How many elements : ");
        int n = Integer.parseInt(br.readLine());
        int Arr[] = new int[n];

        // Accept elements into an array

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter Int : ");
            Arr[i] = Integer.parseInt(br.readLine());
        }

        // using bubble sort technique t sort integers

        int limit = n - 1; // elements from 0 - 1
        boolean flag = false; // if it is not true, swapping done
        int temp; // temporary variable

        for(int  i = 0; i < limit; i++)
        {
            for(int j = 0; j < limit - 1; j++)
            {
                // if first elemets is bigger than second one than swap
                if(Arr[j] > Arr[j+1])
                {
                temp = Arr[j];
                Arr[j] = Arr[j+1];
                Arr[j+1] = temp;
                flag = true;
                }
            }
            if(flag == false)
             {
                 break;
             }
             else
             {
                 flag = false;
             }
        }
        
        // display the sorted array

        System.out.println( " The sorted array is : ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
