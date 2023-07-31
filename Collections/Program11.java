// Write a program that shows sorting using comparater

import java.util.*;
import java.io.*;

public class Program11
{
  public static void main(String args[]) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("How many elements : ");
    int iSize = Integer.parseInt(br.readLine());

    // create an array of size 
    Integer[] Arr = new Integer[iSize];

    // store the values into array
    for(int i = 0; i < iSize; i++)
    {
        Arr[i] = Integer.parseInt(br.readLine());
    }

    // sort the array
    Arrays.sort(Arr,new Ascend());

    // display the sorted array
    System.out.println("Sorted array  in Ascending order : ");
    display(Arr);

    // Display sorted array in descending order
   // Arrays.sort(Arr,new Descend());
    System.out.println("Sorted arrays in descending order ");
    display(Arr);

  }

  static void display(Integer Arr[])
  {
    for(int i : Arr)
    {
        System.out.println(i+"\t");
    }
  }
}
// to sort array  in Ascnding order

class Ascend implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
       return i1.compareTo(i2);
    }
}
// ro sort array in descending order
class Descend implements Comparater<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        return i1.compareTo(i2);
    }
}