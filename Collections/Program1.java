// Write a program to store a group of objects intoan array and retreive the object data and display

import java.util.*;
import java.io.*;

public class Program1
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // create employee type array with size 5
    Employee arr[] = new Employee[5];

    Employee emp = new Employee(0, null);

    for(int i = 0; i < 5; i++)
    {
        System.out.println("Enter ID : ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Name : ");
        String name = br.readLine();

        arr[i] = new Employee(id, name);
    }
  
    System.out.println("Employee data is : ");
    // Display the employee data
  
   for(int j = 0; j < arr.length; j++)
   {
     arr[j].Display();
   }

  }
}
class Employee
{
    // instance variables
    int id;
    String Name;

    // to store data
    public Employee(int i, String N)
    {
        id = i;
        Name = N;
    }
    // method to display data
    void Display()
    {
        System.out.println(id+"\t"+Name);
    }
}