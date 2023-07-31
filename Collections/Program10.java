// Write a program that shows use of Arrays

import java.util.*;
import java.io.*;

public class Program10
{
    public static void main(String args[]) throws Exception
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // create an array

      int Arr[] = new int[5];

      // store elements into array
      for(int i = 0; i < 5; i++)
      {
        System.out.println("ENter an integer : ");
        Arr[i] = Integer.parseInt(br.readLine());
      }
      
      // display the contents of array
      System.out.println("The contents of arrays are : ");
      display(Arr);
    
   

    // sort the array into ascending order
    Arrays.sort(Arr);

   System.out.println("The Sorted array is : ");
    display(Arr);


    // search for en elements
    System.out.println("Enter which elements to search : ");
    int element = Integer.parseInt(br.readLine());
    int index = Arrays.binarySearch(Arr,element);

    if(index < 0)
    {
        System.out.println("Elements not found");
    }
    else
    {
        System.out.println("element found at location "+(index+1));
    }
}

      static void display(int[] Arr)
    {
        for(int i : Arr)
        System.out.println(i);
    }
    
}
