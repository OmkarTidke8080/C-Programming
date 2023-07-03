// write a program to accept the name and age through command line arguments and check whther perosn is youg ir adult

import java.io.*;
import java.util.Scanner;

class Person
{
    private String Name;
    private int Age;

    Person(String N,int I)
    {
        Name = N;
        Age = I;
    }

    void Check()
    {
        if(Age < 18)
        {
            System.out.println("Person is Young");
        }
        else
        {
            System.out.println("Peron is adult");
        }
    }
}

public class Method1
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

      String S = args[0];
      int A = sc.nextLong(args[1]);

      Person obj = new Person(S,A);

    }
}
