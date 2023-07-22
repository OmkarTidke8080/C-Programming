// write a program to display the sum of two matrix as another matrix

import java.io.IOException;
import java.util.*;
import java.io.*;


public class MatrixSum
{
  public static void main(String args[]) throws IOException
  {
     Scanner sobj = new Scanner(System.in);

     int r ;
     int c;

     System.out.println("Enter number of rows : ");
     r = sobj.nextInt();

     System.out.println("Enter number of columns : ");
     c = sobj.nextInt();

     int Arr[][];
     Arr = new int[r][c]; 

     int Brr[][];
     Brr = new int[r][c];

     int Srr[][];
     Srr = new int[r][c];

     System.out.println("Enter elements of first Array : ");
     for(int i = 0; i < r; i++)
     {
      for(int j = 0; j < c; j++)
      {
        Arr[i][j] = sobj.nextInt();
      }
     }

     System.out.println("Enter elemenst of second array  : ");
     for(int i = 0; i < r; i++)
     {
      for(int j = 0; j < c; j++)
      {
        Brr[i][j] = sobj.nextInt();
      }
     }

     System.out.println("Addition Array  : ");
     for(int i = 0; i < r; i++)
     {
      for(int j = 0; j < c; j++)
      {
         Srr[i][j] = Arr[i][j] + Brr[i][j];
      }
     }

     System.out.println("Sum of Array  : ");
      for(int i = 0; i < r; i++)
     {
      for(int j = 0; j < c; j++)
      {
        System.out.println(Srr[i][j]+"\t");
      }
     }

     

    sobj.close();
  }
}