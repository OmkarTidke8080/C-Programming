// write a program for a method without parameters and without a return type

import java.io.*;
import java.util.Scanner;

class Sample
{
    // instance variables
    public  
    double num1;
    double num2;

    
    // method to calculate sum of num1 and num2;
    // this mwthod accept 2 values
    // does not retun=rn result

   

    void sum()
    {
         Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter number 1 : ");
        num1  = sc.nextInt();

        System.out.println("Enter number 2  :");
        num2  = sc.nextInt();

        double s;

        s = num1 + num2;

        System.out.println("The sum is : "+s);
    }
}
public class Method1
{
    public static void main(String args[])
    {
    Sample s = new Sample();

    s.sum();
    }
}