//  write a program to accept a matrix from user and display its matrix

import java.io.*;
import java.util.Scanner;

public class transpose
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        // Accept number of rows
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
     
        // Accept number of columns
        System.out.println("Enter number of columns");
        int c = sc.nextInt();

        // Create an array with size r and c
        int Arr[][] = new int[r][c];

        // Accept  matrix from user
        System.out.println("Enter elements of matrix : ");
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        
        // diplay the marix 
        // take columns and rows vice versa

        System.out.println("The transpose of a matrix is :");

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println("\n");

        }
    }
    
}
