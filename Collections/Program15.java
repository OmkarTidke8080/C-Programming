// An Array List handling group of employee objects

import java.util.*;
import java.io.*;

public class Program15
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        String address;

        ArrayList<Employee> ar1 = new ArrayList<>();

        // Acecpt 5 employee details
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter id : ");
            id = Integer.parseInt(br.readLine());
           
            System.out.println("ENter Name : ");
            name = br.readLine();

            System.out.println("Enter Address : ");
            address = br.readLine();

            Employee obj = new Employee(i, name, address);

            ar1.add(obj);

        }

        // now search fro an employee id
        System.out.println("Enter ID to search : ");
        id = Integer.parseInt(br.readLine());

        boolean found = false;

        for(int i = 0; i < ar1.size(); i++)
        {
            Employee obj = ar1.get(i);

            if(id == obj.id)
            {
                obj.Display();
                found = true;
            }
            if(!found)
        {
            System.out.println("Employee not found");
        }
        }
        
    }
}
class Employee
{
    // take variable
    int id = 0;
    String name ;
    String address;

    // initializing 
   public  Employee(int i, String N, String A)
    {
        id = i;
        name = N;
        address = A;
    }

    // display employee detail
    void Display()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
    }
}